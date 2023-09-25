package Homework_nr_8;

public class EnglishWord extends Word{
    public String Language = "English";

    public EnglishWord(String value, String partOfSpeech, String language) {
        super(value, partOfSpeech);
        Language = language;
    }
}
