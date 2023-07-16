import java.util.HashMap;

public class RestPageObject {

    String endPoint = "https://pudra.by/login";

    public HashMap<String, String> getHeader() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("Cookie", "PHPSESSID=0jdvj9j8mve4m9erfiid4nlb40; cacheUid=91a5b83c60d744f4f8eee73c75bd92dceca0cdd9f799fcb555dd5696a5b48b9ca%3A2%3A%7Bi%3A0%3Bs%3A8%3A%22cacheUid%22%3Bi%3A1%3Bs%3A40%3A%22060b0ee223ef3ca4422bd8afe7a399724ebb225d%22%3B%7D; _csrf=65a485c733d7c27a2adb1acfae641a149d05f43707f787386a448e7a010bfd73a%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22%985%B2%C0%F1%8E%E6%04L%13%DFp%D3%C8%D5%0F%D0%FDj%D8%B5%CF%D6%1C%EE%CD%C8%E9eU%C4%3D%22%3B%7D; _ym_uid=1689510598406042005; _ym_d=1689510598; _ga=GA1.1.1576074928.1689510598; _ym_isad=1; _ga_HM7JG6L03Q=GS1.1.1689517700.3.0.1689517700.60.0.0");
        return headers;
    }

    public HashMap<String, String> getFormData() {
        HashMap<String, String> formData = new HashMap<>();
        formData.put("Client[email]", "test@test.com");
        formData.put("Client[password]", "ddddddd");
        formData.put("_csrf", "k-Tb3PXiHmu1HHSKKYZ63xSwZbfopDRyWir11Ga4qJ8L0WkcBGz4b_kPq_r6Tq_QxE0Pb11r4m605z09A-1sog==");
        return formData;
    }
}
