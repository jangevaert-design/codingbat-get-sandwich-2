public class GetSandwich2 {
  public String getSandwich(String str) {
    if (str.length() <= 10){
      return "";
    }
    return str.substring((str.indexOf("bread") + 5), str.lastIndexOf("bread"));

  }
}
