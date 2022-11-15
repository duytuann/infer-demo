class SimpleNull {
  int test() {
    String s = null;
    return s == null ? -1 : s.length(); 
  }
}
