package student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Students {
	
	@Id
    @Column(length = 7) 
	private String stid;
    
    @Column(length=20)
    private String add;

    @Column
	private Integer grade;

    @Column(length=10) 
	private String name;
    
    @Column(columnDefinition = "TEXT")
    private String gmemo;

}
