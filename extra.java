 private static Scanner scanner;
    private static void readFile() {
      if (!scanner.hasNext()) return;
      String line = scanner.next();
      if(line.substring(0, 1).matches("[a-zA-Z]+")||line.substring(0, 1).matches("[0-9]+")){
          if(line.matches("[a-zA-Z]+")||line.matches("[0-9]+")||line.endsWith(",")){
      System.out.println(line);}}
      readFile();}