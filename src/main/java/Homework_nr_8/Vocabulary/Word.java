package Homework_nr_8.Vocabulary;

abstract public class Word {
    private String value;
    private String partOfSpeech;

    public Word(String value, String partOfSpeech) {
        this.value = value;
        this.partOfSpeech = partOfSpeech;
    }
}
