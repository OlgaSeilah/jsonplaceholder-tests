package jsonplaceholder.tests.topFrequentWords.helpers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TopWordsModel {
    private String word;
    private Long count;

    @Override
    public String toString() {
        return word + " - " + count;
    }
}
