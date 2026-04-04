package com.domVkotorom;

public class Individual_main {
    public static void main(String[] args) {
        Senior2 blind = new Senior2("Слепой",
                Location.HOUSE,
                Group.FOURTH,
                "Ходячий",
                "Вожак",
                null,
                false,
                false,
                true);

        Senior2 sphinx = new Senior2("Сфинкс",
                Location.HOUSE,
                Group.FOURTH,
                "Ходячий",
                "Зам.вожака",
                "Кузнечик",
                false,
                false,
                true);

        blind.printInfo();
        System.out.println();
        sphinx.printInfo();
    }


}
