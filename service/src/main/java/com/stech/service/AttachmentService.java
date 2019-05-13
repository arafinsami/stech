package com.stech.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stech.entity.Attachment;
import com.stech.entity.User;
import com.stech.repository.AttachmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AttachmentService {

	private final AttachmentRepository attachmentRepository;

	public Optional<Attachment> get(long id) {
		return attachmentRepository.findById(id);
	}

	@Transactional
	public Attachment save(String filename, String fileType, long size, boolean publicResource, byte[] bytes,
			String description, User user) {
		return attachmentRepository
				.save(new Attachment(filename, size, fileType, description, user, publicResource, bytes));
	}
}
