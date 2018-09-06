package com.admin.server.service;

import java.util.List;

import com.admin.server.model.Mail;

public interface MailService {

	void save(Mail mail, List<String> toUser);
}
