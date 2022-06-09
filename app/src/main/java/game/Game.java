package game;

public class Game {

	String word;
  Integer remainingAttempts = 10;


  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }


  public Game(String string) {
    word = string;
  }


  public String getWordToGuess() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < this.word.length(); i++ ){
      if (i == 0){
        char currentLetter = word.charAt(0);
        sb.append(currentLetter);
      }else {
        sb.append("_");
      }
    }

    return sb.toString();
  }




}
