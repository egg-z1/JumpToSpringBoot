package com.mysite.test.user;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {
	
	@Id
	@Column(length = 7)
	private Integer sId;
	
	private String username;
	
	@Column(length = 50)
	private String address;
	
	@Column
	private Integer grade;
	
	@Column(columnDefinition = "TEXT")
	private String memo;
	
	private LocalDateTime createDate;

}
