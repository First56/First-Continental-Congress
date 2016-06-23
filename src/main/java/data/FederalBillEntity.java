package data;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FederalBillEntity {

    private String billResolutionType;
    private String billType;
    //TODO: Define CommitteeEntity object
    //private List<CommitteeEntity> committees;
    private int congress;
    //TODO: Define PersonEntity object
    //private List<PersonEntity> cosponsors;
    private String currentStatus;
    private DateTime currentStatusDate;
    private String currentStatusDescription;
    private String displayNumber;
    private long id;
    private DateTime introductionDate;
    private String link;
    private long billNumber;
    //TODO: Define PersonEntity
    //private PersonEntity sponsor;
    //TODO: Define RoleEntity
    //private Role sponsorRole;
    private String title;
    private String titleWithoutNumber;
    
    public String getBillResolutionType() {
        return billResolutionType;
    }
    
    @JsonSetter("bill_resolution_type")
    public void setBillResolutionType(String billResolutionType) {
        this.billResolutionType = billResolutionType;
    }
    
    public String getBillType() {
        return billType;
    }
    
    @JsonSetter("bill_type")
    public void setBillType(String billType) {
        this.billType = billType;
    }
    
    public int getCongress() {
        return congress;
    }
    
    @JsonSetter("congress")
    public void setCongress(int congress) {
        this.congress = congress;
    }
    
    public String getCurrentStatus() {
        return currentStatus;
    }
    
    @JsonSetter("current_status")
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
    
    public DateTime getCurrentStatusDate() {
        return currentStatusDate;
    }
    
    @JsonSetter("current_status_date")
    public void setCurrentStatusDate(String currentStatusDate) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime currentStatusDateObj = formatter.parseDateTime(currentStatusDate);
        this.currentStatusDate = currentStatusDateObj;
    }
    
    public void setCurrentStatusDate(DateTime currentStatusDate) {
        this.currentStatusDate = currentStatusDate;
    }
    
    public String getCurrentStatusDescription() {
        return currentStatusDescription;
    }
    
    @JsonSetter("current_status_description")
    public void setCurrentStatusDescription(String currentStatusDescription) {
        this.currentStatusDescription = currentStatusDescription;
    }
    
    public String getDisplayNumber() {
        return displayNumber;
    }
    
    @JsonSetter("display_number")
    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
    }
    
    public long getId() {
        return id;
    }
    @JsonSetter("id")
    public void setId(long id) {
        this.id = id;
    }
    
    public DateTime getIntroductionDate() {
        return introductionDate;
    }
    
    @JsonSetter("introduced_date")
    public void setIntroductionDate(String introductionDate) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime introductionDateObj = formatter.parseDateTime(introductionDate);
        this.introductionDate = introductionDateObj;
    }
    
    public void setIntroductionDate(DateTime introductionDate) {
        this.introductionDate = introductionDate;
    }
    
    public String getLink() {
        return link;
    }
    
    @JsonSetter("link")
    public void setLink(String link) {
        this.link = link;
    }
    
    public long getBillNumber() {
        return billNumber;
    }
    
    @JsonSetter("number")
    public void setBillNumber(long billNumber) {
        this.billNumber = billNumber;
    }
    
    public String getTitle() {
        return title;
    }
    
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitleWithoutNumber() {
        return titleWithoutNumber;
    }
    
    @JsonSetter("title_without_number")
    public void setTitleWithoutNumber(String titleWithoutNumber) {
        this.titleWithoutNumber = titleWithoutNumber;
    }
}
