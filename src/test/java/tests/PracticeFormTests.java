package tests;

import org.junit.jupiter.api.Test;

public class PracticeFormTests extends BaseTest {
    String firstName = "Larry";
    String lastName = "Brown";
    String email = "larrybrown@gmail.com";
    String gender = "Male";
    String mobileNumber = "1234567890";
    String yearOfBirth = "2001";
    String mothOfBirth = "June";
    String dayOfBirth = "12";
    String subject = "Math";
    String filePath = "src/test/resources/test.jpg";
    String pictureName = "test.jpg";
    String address = "Test address";
    String state = "Haryana";
    String city = "Karnal";

    @Test
    public void userCanFillAndSubmitTheForm() {
        practiceFormPage
                .openPracticeFormPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectGender(gender)
                .enterMobileNumber(mobileNumber)
                .selectDateOfBirth(yearOfBirth, mothOfBirth, dayOfBirth)
                .enterSubject(subject)
                .uploadPicture(filePath)
                .enterCurrentAddress(address)
                .selectState(state)
                .selectCity(city)
                .clickSubmitButton();

        practiceFormPage
                .checkStudentName(firstName + " " + lastName)
                .checkStudentEmail(email)
                .checkStudentGender(gender)
                .checkMobileNumber(mobileNumber)
                .checkDateOfBirth(dayOfBirth + " " + mothOfBirth + "," + yearOfBirth)
                .checkSubjects(subject)
                .checkPicture(pictureName)
                .checkAddress(address)
                .checkStateAndCity(state + " " + city);
    }
}
