package utilities.TestData;

import com.github.javafaker.Faker;

public class TestDataBase {

    // InstuLearnPage Password Email
    public static final String teacherValidPassword ="Learn.2504";
    public static final String studentValidPassword ="Learn.2504";
    public static  String validTeacherAlicanMail ="alican.teacher@instulearn.com";
    public static  String validStudentAlicanMail ="alican.student@instulearn.com";
    public static  String validTeacherBatuhanMail ="batuhan.teacher@instulearn.com";
    public static  String validStudentBatuhanMail ="batuhan.student@instulearn.com";
    public static  String validTeacherAhmetMail ="ahmegulmek.teacher@instulearn.com";
    public static  String validStudentAhmetMail ="ahmegulmek.student@instulearn.com";
    public static  String validTeacherArzuMail ="arzu.teacher@instulearn.com";
    public static  String validStudentArzuMail ="arzu.student@instulearn.com";
    public static  String validTeacherBanuMail ="banu.teacher@instulearn.com";
    public static  String validStudentBanuMail ="banu.student@instulearn.com";
    public static  String validTeacherBurakMail ="burak.teacher@instulearn.com";
    public static  String validStudentBurakMail ="burak.student@instulearn.com";
    public static  String validTeacherDeryaMail ="derya.teacher@instulearn.com";
    public static  String validStudentDeryaMail ="derya.student@instulearn.com";
    public static  String validTeacherKubraMail ="kubra.teacher@instulearn.com";
    public static  String validStudentKubraMail ="kubra.student@instulearn.com";
    public static  String validTeacherNehirMail ="aslisah.teacher@instulearn.com";
    public static  String validStudentNehirMail ="aslisah.student@instulearn.com";
    public static  String validTeacherMuammerMail ="muammer.teacher@instulearn.com";
    public static  String validStudentMuammerMail ="muammer.student@instulearn.com";
    public static  String validTeacherOrkunMail ="orkun.teacher@instulearn.com";
    public static  String validStudentOrkunMail ="orkun.student@instulearn.com";
    public static  String validTeacherUgurMail ="ugur.teacher@instulearn.com";
    public static  String validStudentUgurMail ="ugur.student@instulearn.com";



    // InstuLearnPage endpoints
    public static final String baseUrl = "https://qa.instulearn.com/";
    public static final String homePageUrl = "https://qa.instulearn.com/";
    public static final String coursesPageUrl = baseUrl+ "classes?sort=newest";
    public static final String instructorsPageUrl = baseUrl+ "instructors";
    public static final String storePageUrl = baseUrl+ "products";
    public static final String blogPageUrl = baseUrl+ "blog";
    public static final String loginPageUrl = baseUrl+ "login";
    public static final String registerPageUrl = baseUrl+ "register";
    public static final String aboutPageUrl = baseUrl+ "pages/about";
    public static final String contactPageUrl = baseUrl+ "contact";
    public static final String certificateValidationPageUrl = baseUrl+ "certificate_validation";
    public static final String termsPageUrl = baseUrl+ "pages/terms";
    public static final String dashboardPageUrl = baseUrl+ "panel";


    // Other Url and title

    public static final String facebookTitle = "Facebook - log in or sign up";
    public static final String facebookUrl = "https://www.facebook.com/";
    public static final String twitterTitle = "X. It’s what’s happening / X";
    public static final String twitterUrl = "https://twitter.com/";
    public static final String instagramTitle = "Instagram";
    public static final String instagramUrl = "https://www.instagram.com/";
    public static final String whatsappUrl = "https://www.whatsapp.com/";

    // fake info
    public static Faker faker = new Faker();

    public static final String fakeName="NameName";
    public static final String fakeEmail="deneme1@gmail.com";
    public static final String fakeMessage="denemeMessage";
    public static final String fakeSkills="denemeSkills";
    public static final String fakeLinkeldn ="deneme.linkeldn";
    public static final String fakeBirthday= "01.01.1990";
    public static final String fakeBio = " Deneme okudum, Deneme calistim, Denemeden hoslanirim, Deneme idealim";
    public static final String fakeLocation= "DenemeLocation";

    public static final String fakeRegisterEmail = faker.internet().emailAddress();


    // invalid info
    public static final String invalidEmailForRegister = "ahmetgulmek";
    public static final String invalidPasswordForRegister = "asdf";


}
