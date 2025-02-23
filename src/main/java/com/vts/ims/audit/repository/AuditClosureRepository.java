package com.vts.ims.audit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vts.ims.audit.model.AuditClosure;

public interface AuditClosureRepository extends JpaRepository<AuditClosure, Long>{
	
	
	public List<AuditClosure> findByIsActive(int isActive);
	
	@Query(value = "SELECT b.IqaId,a.ClosureDate,b.FromDate FROM ims_audit_closure a LEFT JOIN ims_audit_iqa b ON  a.IqaId = b.IqaId WHERE a.IsActive = 1 AND b.IsActive = 1 ORDER BY b.IqaId DESC",nativeQuery = true)
	public List<Object[]> getClosureDate();
	@Query(value = " SELECT ClosureId,IqaId,AttachmentName,Remarks,ClosureDate FROM ims_audit_closure  WHERE IqaId=:iqaId AND IsActive=1",nativeQuery = true)
	public List<Object[]> getClosureattachmentDetails(@Param("iqaId") Long iqaId);

	
	
}
