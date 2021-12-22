public class StringToInt{
  public static void main(String[] args){
    System.out.println(stringToInt(args[0]) == Integer.parseInt(args[0]));
  }
  public static int stringToInt(String str){
    int ans = 0;
    for (int i = 0; i < str.length(); i++){
      ans+=valueOfDigit(str.charAt(i));
      if (i != str.length() - 1){
        ans*=10;
      }
    }
    //System.out.prinln(ans);
    return ans;
  }
  public static int valueOfDigit(char c){
    for (int i = 0; i < 9; i++){
      if (c == '0'+i){
        return i;
      }
    }
    return 9;
  }
}
