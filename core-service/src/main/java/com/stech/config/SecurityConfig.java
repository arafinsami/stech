package com.stech.config;

import com.stech.security.CustomAuthEventHandler;
import com.stech.security.UserDetailsServiceImpl;
import com.stech.filter.BrowserCookieEnabledCheckingFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.token.KeyBasedPersistenceTokenService;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;

import java.security.SecureRandom;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${auth.serverSecret}")
    private String serverSecret;

    @Value("${auth.serverInteger}")
    private int serverInteger;

    private final UserDetailsServiceImpl userDetailsService;

    private final SecurityContextRepository securityContextRepository;

    private final CustomAuthEventHandler authEventHandler;
    
    private static final String[] PUBLIC_MATECHERS = {"/forget-password","/confirm-account","/common-data/api", "/", "/index", "/signup-service-seeker", "/signup-service-provider",
			"/resources/**", "/setup*", "/login*" };
	private static final String[] SWAGGER_MATECHERS = { "/v2/api-docs", "/configuration/ui", "/swagger-resources",
			"/configuration/security", "/swagger-ui.html", "/webjars/**" };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
        http    
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .securityContext().securityContextRepository(securityContextRepository)
                .and()
                .authorizeRequests()
                .antMatchers(PUBLIC_MATECHERS).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable()
                .formLogin()
                .loginPage("/auth/login")
                .loginProcessingUrl("/perform_login")
                .successHandler(authEventHandler)
                .failureHandler(authEventHandler)
                .permitAll()
                .and()
                .logout()
                .logoutSuccessHandler(authEventHandler)
                .logoutUrl("/logout")
                .and()
                .addFilterBefore
                      (
                		new BrowserCookieEnabledCheckingFilter(),
                		UsernamePasswordAuthenticationFilter.class
                	  );
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(SWAGGER_MATECHERS);
        web.httpFirewall(allowUrlEncodedSlashHttpFirewall());
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public TokenService tokenService() {
        KeyBasedPersistenceTokenService res = new KeyBasedPersistenceTokenService();
        res.setSecureRandom(new SecureRandom());
        res.setServerSecret(serverSecret);
        res.setServerInteger(serverInteger);

        return res;
    }

    @Bean
    public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        firewall.setAllowUrlEncodedSlash(true);
        firewall.setAllowSemicolon(true);
        return firewall;
    }
}



