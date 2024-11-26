package com.vts.ims.audit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vts.ims.audit.model.AuditSchedule;

public interface AuditScheduleRepository extends JpaRepository<AuditSchedule, Long> {
	
	@Query(value="SELECT a.ScheduleId,a.ScheduleDate,a.AuditeeId,a.TeamId,c.TeamCode,d.EmpId,d.DivisionId,d.GroupId,d.ProjectId,(SELECT MAX(b.RevisionNo) FROM ims_audit_schedule_rev b WHERE a.ScheduleId= b.ScheduleId AND b.IsActive = 1) AS 'revision',a.ScheduleStatus,a.IqaId,e.StatusName,f.IqaNo,\r\n"
			+ "(SELECT g.Remarks FROM ims_audit_schedule_rev g WHERE a.ScheduleId= g.ScheduleId AND g.IsActive = 1 ORDER BY RevScheduleId DESC LIMIT 1) AS 'remarks',a.ActEmpId FROM ims_audit_schedule a,ims_audit_team c,ims_audit_auditee d,ims_audit_status e,ims_audit_iqa f \r\n"
			+ "WHERE a.IsActive = 1 AND a.IsActive = 1 AND a.TeamId = c.TeamId AND d.IsActive = 1 AND d.AuditeeId = a.AuditeeId AND a.ScheduleStatus = e.AuditStatus AND a.IqaId = f.IqaId ORDER BY a.ScheduleId DESC",nativeQuery = true)
	public List<Object[]> getScheduleList();
	
	@Query(value="CALL ims_audit_schedule_approval(:empId)",nativeQuery = true)
	public List<Object[]> getScheduleApprovalList(@Param("empId")Long empId);
}
