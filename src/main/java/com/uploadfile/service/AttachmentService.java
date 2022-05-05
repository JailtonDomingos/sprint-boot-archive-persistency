package com.uploadfile.service;

import org.springframework.web.multipart.MultipartFile;

import com.uploadfile.entity.Attachment;

public interface AttachmentService {

	Attachment saveAttachment(MultipartFile file) throws Exception;

	Attachment getAttachment(String fileId) throws Exception;

}
