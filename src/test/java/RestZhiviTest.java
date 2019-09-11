import io.restassured.RestAssured;
import org.junit.Test;

public class RestZhiviTest {    //.....если я правильно понял...убил просто так 4 дня(-_-)

//@Test     //  Аяз! почему не работает 100 ?(Freez)
//    public void ChekKod100(){
//    RestAssured.given()
//            .when().post("http://httpbin.org/status/100").then().statusCode(100);
//}
@Test
        public void Chekkod200(){
        RestAssured.given()
                .when().post("http://httpbin.org/status/200").then().statusCode(200);
    }
@Test
        public void ChekKod300(){
    RestAssured.given()
            .when().post("http://httpbin.org/status/300").then().statusCode(300);
}
@Test
    public void ChekKod400(){
        RestAssured.given()
                .when().post("http://httpbin.org/status/300").then().statusCode(300);
    }
@Test
    public void ChekKod500(){
        RestAssured.given()
                .when().post("http://httpbin.org/status/500").then().statusCode(500);
    }
}
