package com.vts.ims.master.service;

import java.util.List;

import com.vts.ims.master.dto.DocTemplateAttributesDto;
import com.vts.ims.master.dto.LabMasterDto;
import com.vts.ims.master.dto.LoginDetailsDto;

public interface MasterService {

	public LabMasterDto labDetailsList(String username) throws Exception;
	public String LogoImage()throws Exception;
	public DocTemplateAttributesDto getDocTemplateAttributesDto() throws Exception;
	public List<LoginDetailsDto> loginDetailsList(String user) throws Exception;
	public String getDrdoLogo()throws Exception;
	
	
}