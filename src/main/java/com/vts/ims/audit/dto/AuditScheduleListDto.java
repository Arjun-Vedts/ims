package com.vts.ims.audit.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@Builder
@NoArgsConstructor
public class AuditScheduleListDto {
	
	private Long scheduleId;
	private String scheduleDate;
	private Long auditeeId;
	private Long teamId;
	private Long iqaId;
	private Long actEmpId;
	private Long loginEmpId;
	private String iqaNo;
	private String remarks;
	private String teamCode;
	private Long auditeeEmpId;
	private Long divisionId;
	private Long groupId;  
	private Long projectId;  
	private Integer revision;
	private String auditeeEmpName;
	private String divisionName;
	private String groupName;  
	private String projectName;  
	private String divisionCode;
	private String groupCode;  
	private String projectCode; 
	private String projectShortName; 
	private String scheduleStatus;  
	private String statusName;  
	private Long leadEmpId;
	private String message; 
	private String auditeeFlag; 
	private Long fwdFlag; 
	private String scope;
	
}
