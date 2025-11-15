package com.mu.moravian_courses.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * This class represents a row in the "courses" table in PostgreSQL.
 *
 * In Spring Boot:
 * - An @Entity class is a Java version of a database table.
 * - Each field = one column in the table.
 * - JPA/Hibernate automatically turns objects into SQL and SQL back into objects.
 *
 * JPA (Jakarta Persistence API) = the standard way Java apps talk to databases.
 * Hibernate = the engine Spring Boot uses under the hood to run your SQL for you.
 */
@Entity
@Table(name = "courses") // Maps this class to the "courses" table
public class Courses {

    /**
     * Primary key column.
     * @Id means this field uniquely identifies each row.
     * @GeneratedValue makes PostgreSQL auto-generate the ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Below are all your table columns mapped to Java fields.
    // @Column(name="...") connects Java camelCase names to PostgreSQL snake_case names.

    @Column(name = "course_code")
    private String courseCode;

    @Column(name = "parent_child")
    private String parentChild;

    @Column(name = "title")
    private String title;

    @Column(name = "instructor")
    private String instructor;

    @Column(name = "days")
    private String days;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "subterm")
    private String subterm;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "course_type")
    private String courseType;

    @Column(name = "credit_type")
    private String creditType;

    @Column(name = "linc")
    private String linc;

    @Column(name = "instit_div")
    private String institDiv;

    @Column(name = "enr_count")
    private Integer enrCount;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "max_enr")
    private Integer maxEnr;

    @Column(name = "units_credits")
    private BigDecimal unitsCredits;

    @Column(name = "fnote")
    private String fnote;

    @Column(name = "fee")
    private String fee;

    @Column(name = "show_on_web")
    private String showOnWeb;

    /**
     * JPA requires a no-argument constructor.
     * Hibernate uses this to build objects when loading data from the database.
     */
    public Courses() {}

    // ----------- GETTERS AND SETTERS -----------
    // These allow Spring/Hibernate to read/write your fields.

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getParentChild() { return parentChild; }
    public void setParentChild(String parentChild) { this.parentChild = parentChild; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }

    public String getDays() { return days; }
    public void setDays(String days) { this.days = days; }

    public LocalTime getStartTime() { return startTime; }
    public void setStartTime(LocalTime startTime) { this.startTime = startTime; }

    public LocalTime getEndTime() { return endTime; }
    public void setEndTime(LocalTime endTime) { this.endTime = endTime; }

    public String getSubterm() { return subterm; }
    public void setSubterm(String subterm) { this.subterm = subterm; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getCourseType() { return courseType; }
    public void setCourseType(String courseType) { this.courseType = courseType; }

    public String getCreditType() { return creditType; }
    public void setCreditType(String creditType) { this.creditType = creditType; }

    public String getLinc() { return linc; }
    public void setLinc(String linc) { this.linc = linc; }

    public String getInstitDiv() { return institDiv; }
    public void setInstitDiv(String institDiv) { this.institDiv = institDiv; }

    public Integer getEnrCount() { return enrCount; }
    public void setEnrCount(Integer enrCount) { this.enrCount = enrCount; }

    public Integer getCapacity() { return capacity; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }

    public Integer getMaxEnr() { return maxEnr; }
    public void setMaxEnr(Integer maxEnr) { this.maxEnr = maxEnr; }

    public BigDecimal getUnitsCredits() { return unitsCredits; }
    public void setUnitsCredits(BigDecimal unitsCredits) { this.unitsCredits = unitsCredits; }

    public String getFnote() { return fnote; }
    public void setFnote(String fnote) { this.fnote = fnote; }

    public String getFee() { return fee; }
    public void setFee(String fee) { this.fee = fee; }

    public String getShowOnWeb() { return showOnWeb; }
    public void setShowOnWeb(String showOnWeb) { this.showOnWeb = showOnWeb; }
}
