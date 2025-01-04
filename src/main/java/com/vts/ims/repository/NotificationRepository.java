package com.vts.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vts.ims.model.ImsNotification;

import feign.Param;

public interface NotificationRepository extends JpaRepository<ImsNotification, Long>{

	
	
	@Query(value = "SELECT a.NotificationId,a.EmpId,a.Notificationby,a.NotificationUrl,a.NotificationDate,a.NotificationMessage  FROM notification a WHERE a.EmpId=:empid and a.IsActive=1 order by a.NotificationId desc",nativeQuery = true)
	public List<Object[]> getNotifictionList(@Param("empid") Long empid);
	
	@Query(value = "SELECT COUNT(*) FROM notification WHERE IsActive='1' AND EmpId=:empid",nativeQuery = true)
	public int getNotifictionCount(@Param("empid") Long empid);

	
}
