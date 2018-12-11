package com.wazn.ui.model;

public class GetAllDataResponse {

    private String email;
    private String mobile;
    private String fullName;
    private String verificationCode;
    private String password;
    private String confirmPassword;
    private String status;

    private String type;

    private String documentType;
    private String documentNumber;
    private String issuingCountry;
    private String personalNumber;
    private String regNumber;
    private String validThrough;
    private String ownComment;
    private String helpDeskComment;
    private String birthDate;
    private String gender;
    private String nationality;

    private String documentIdImageFace;
    private String documentIdImageBack;
    private String personalImage;

    private String startDate;
    private String note;

    private String enteredOn;
    private String location;
    private String enteredBy;

    private String assessmentDocumentBearer;
    private String faceMatch;
    private String checkMRZ;
    private String automationAuthentications;

    private String passportOrVisaImage;
    private String salaryCertificateImage;
    private String taxDeclarationImage;

    public GetAllDataResponse() {
    }

    public GetAllDataResponse(String mobile, String email, String fullName, String verificationCode, String type, String documentType, String documentNumber, String issuingCountry, String personalNumber, String regNumber, String validThrough, String ownComment, String helpDeskComment, String birthDate, String gender, String nationality, String documentIdImageFace, String documentIdImageBack, String personalImage, String startDate, String note, String enteredOn, String location, String enteredBy, String assessmentDocumentBearer, String faceMatch, String checkMRZ, String automationAuthentications, String passportOrVisaImage, String salaryCertificateImage, String taxDeclarationImage, String status) {
        this.email = email;
        this.mobile = mobile;
        this.fullName = fullName;
        this.verificationCode = verificationCode;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.type = type;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.issuingCountry = issuingCountry;
        this.personalNumber = personalNumber;
        this.regNumber = regNumber;
        this.validThrough = validThrough;
        this.ownComment = ownComment;
        this.helpDeskComment = helpDeskComment;
        this.birthDate = birthDate;
        this.gender = gender;
        this.nationality = nationality;
        this.documentIdImageFace = documentIdImageFace;
        this.documentIdImageBack = documentIdImageBack;
        this.personalImage = personalImage;
        this.startDate = startDate;
        this.note = note;
        this.enteredOn = enteredOn;
        this.location = location;
        this.enteredBy = enteredBy;
        this.assessmentDocumentBearer = assessmentDocumentBearer;
        this.faceMatch = faceMatch;
        this.checkMRZ = checkMRZ;
        this.automationAuthentications = automationAuthentications;
        this.passportOrVisaImage = passportOrVisaImage;
        this.salaryCertificateImage = salaryCertificateImage;
        this.taxDeclarationImage = taxDeclarationImage;
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getValidThrough() {
        return validThrough;
    }

    public void setValidThrough(String validThrough) {
        this.validThrough = validThrough;
    }

    public String getOwnComment() {
        return ownComment;
    }

    public void setOwnComment(String ownComment) {
        this.ownComment = ownComment;
    }

    public String getHelpDeskComment() {
        return helpDeskComment;
    }

    public void setHelpDeskComment(String helpDeskComment) {
        this.helpDeskComment = helpDeskComment;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDocumentIdImageFace() {
        return documentIdImageFace;
    }

    public void setDocumentIdImageFace(String documentIdImageFace) {
        this.documentIdImageFace = documentIdImageFace;
    }

    public String getDocumentIdImageBack() {
        return documentIdImageBack;
    }

    public void setDocumentIdImageBack(String documentIdImageBack) {
        this.documentIdImageBack = documentIdImageBack;
    }

    public String getPersonalImage() {
        return personalImage;
    }

    public void setPersonalImage(String personalImage) {
        this.personalImage = personalImage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEnteredOn() {
        return enteredOn;
    }

    public void setEnteredOn(String enteredOn) {
        this.enteredOn = enteredOn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEnteredBy() {
        return enteredBy;
    }

    public void setEnteredBy(String enteredBy) {
        this.enteredBy = enteredBy;
    }

    public String getAssessmentDocumentBearer() {
        return assessmentDocumentBearer;
    }

    public void setAssessmentDocumentBearer(String assessmentDocumentBearer) {
        this.assessmentDocumentBearer = assessmentDocumentBearer;
    }

    public String getFaceMatch() {
        return faceMatch;
    }

    public void setFaceMatch(String faceMatch) {
        this.faceMatch = faceMatch;
    }

    public String getCheckMRZ() {
        return checkMRZ;
    }

    public void setCheckMRZ(String checkMRZ) {
        this.checkMRZ = checkMRZ;
    }

    public String getAutomationAuthentications() {
        return automationAuthentications;
    }

    public void setAutomationAuthentications(String automationAuthentications) {
        this.automationAuthentications = automationAuthentications;
    }

    public String getPassportOrVisaImage() {
        return passportOrVisaImage;
    }

    public void setPassportOrVisaImage(String passportOrVisaImage) {
        this.passportOrVisaImage = passportOrVisaImage;
    }

    public String getSalaryCertificateImage() {
        return salaryCertificateImage;
    }

    public void setSalaryCertificateImage(String salaryCertificateImage) {
        this.salaryCertificateImage = salaryCertificateImage;
    }

    public String getTaxDeclarationImage() {
        return taxDeclarationImage;
    }

    public void setTaxDeclarationImage(String taxDeclarationImage) {
        this.taxDeclarationImage = taxDeclarationImage;
    }
}
