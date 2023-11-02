package org.example.question;

public class SqlQuestion extends AbstractQuestion {
    public SqlQuestion() {
        super("Сколько в реляционных (SQL) базах данных существует типов связей между таблицами?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("3");
    }
}
