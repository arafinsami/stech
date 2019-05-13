package com.stech.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.stech.entity.Album;
import com.stech.entity.Pds;
import com.stech.repository.AlbumRepository;
import com.stech.repository.PdsRepository;

@Controller
public class PdsModuleController extends MyBaseControllerPds {

	@Value("${pdsDeletionPath}")
	String pdsDeletionPath;

	@Autowired
	AlbumRepository albumRepository;

	@Autowired
	PdsRepository pdsRepository;
	
	public static final String VIEW_PDS = "dashboard/upload";

	@RequestMapping(value = "/pds", method = RequestMethod.GET)
	public String create(Model model, HttpServletRequest request) {
		Album album = new Album();
		model.addAttribute("album", album);
		return VIEW_PDS;
	}

	@RequestMapping(value = "/pds", method = RequestMethod.POST)
	public String save(Model model, @Valid @ModelAttribute("album") Album album, BindingResult result,
			@RequestParam("file") MultipartFile[] files) {

		List<String> pdsFileList = new ArrayList<>();

		for (MultipartFile multipartFile : files) {
			pdsFileList.add(uploadFile(multipartFile));
		}

		if (album.getPdsList() != null) {
			Integer pdsIndex = new Integer(0);
			for (Pds pds : album.getPdsList()) {
				if (pdsIndex != pdsFileList.size()) {
					if (pdsFileList.get(pdsIndex) != null) {
						pds.setAttachment(pdsFileList.get(pdsIndex));
					}
					if (pds.getAlbum() == null) {
						pds.setAlbum(album);
					}
					pdsIndex++;
				}

			}
		}
		albumRepository.save(album);
		return "redirect:/pds";
	}

	@RequestMapping(value = "/pds/edit/" + "{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") Long id, Model model, HttpServletRequest request) {
		Album album = albumRepository.findById(id).orElseThrow(null);
		model.addAttribute("album", album);
		model.addAttribute("action", "/pds/edit/" + id);
		return "pds/edit";
	}

	@RequestMapping(value = "/pds/edit/" + "{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id") Long id, Model model, @Valid @ModelAttribute("album") Album album,
			@RequestParam("file") MultipartFile[] files) throws IllegalStateException, IOException {

		Album actOld = albumRepository.findById(id).orElseThrow(null);

		List<String> pdsList = new ArrayList<>();

		List<MultipartFile> multipartFileList = new ArrayList<>();

		for (MultipartFile multipartFile : files) {
			pdsList.add(uploadFile(multipartFile));
			multipartFileList.add(multipartFile);
		}

		if (album.getPdsList() != null) {

			Integer pdsIndex = new Integer(0);
			for (Pds newPds : album.getPdsList()) {
				List<Pds> oldPdsList = pdsRepository.findAllByActId(actOld.getId());
				if (oldPdsList.size() != 0) {
					for (Pds pds : oldPdsList) {
						if (newPds.getId() != null && newPds.getId().equals(pds.getId()) && !multipartFileList
								.get(pdsIndex).getContentType().equals("application/octet-stream")) {
							newPds.setAttachment(pdsList.get(pdsIndex));
						} else if (newPds.getId() != null && newPds.getId().equals(pds.getId()) && multipartFileList
								.get(pdsIndex).getContentType().equals("application/octet-stream")) {
							newPds.setAttachment(pds.getAttachment());
						} else if (newPds.getId() == null) {
							newPds.setAttachment(pdsList.get(pdsIndex));
						}
					}
					if (pdsList.get(pdsIndex) != null) {
						newPds.setAttachment(pdsList.get(pdsIndex));
					}
				} else {
					if (pdsList.get(pdsIndex) != null) {
						newPds.setAttachment(pdsList.get(pdsIndex));
					}
				}
				if (newPds.getAlbum() == null) {
					newPds.setAlbum(album);
				}
				pdsIndex++;
			}
		}
		albumRepository.save(album);
		return "redirect:/pds";
	}

	@RequestMapping(value = "/pds/delete/" + "{id}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> delete(@PathVariable("id") Long id, Model model) {

		Pds actScheduleForAct = pdsRepository.findById(id).orElseThrow(null);
		try {
			File file = new File(pdsDeletionPath + actScheduleForAct.getAttachment());
			if (file.delete()) {
				System.out.println(file.getName() + " PDS FILE From PDS Controller File Is Deleted!");
			} else {
				System.out.println("Delete operation Is Failed.");
			}
		} catch (Exception e) {
			System.out.println("Failed to Delete File !!");
		}
		pdsRepository.delete(actScheduleForAct);
		Map<String, Object> response = new HashMap<>();
		response.put("success", true);
		response.put("message", "You have successfully deleted FILE");
		return response;
	}

}




