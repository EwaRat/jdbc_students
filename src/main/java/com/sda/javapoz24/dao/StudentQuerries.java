package com.sda.javapoz24.dao;

public interface StudentQuerries {

    //kopie z workbencha

    public static final String CREATE_TABLE =
            "create table if not exists `student`  (\n" +
                    "`id` integer not null primary key auto_increment,\n" +
                    "`firstName` varchar(255),\n" +
                    "`lastName` varchar(255),\n" +
                    "`age` integer,\n" +
                    "`awarded` boolean,\n" +
                    "`gender` varchar(15));";

    public static final String INSERT_STUDENT =
            "INSERT INTO `student`\n" +
                    "(`firstName`, `lastName`, `age`, `awarded`, `gender`) VALUES (?, ?, ?, ?, ?);";


    public static final String SELECT_STUDENTS =
            "SELECT * from `student`;";

    public static final String DELETE_STUDENT =
            "DELETE FROM `student` WHERE `id`=?;";

    // TODO - dopisac metode update
    //uzytkownik wpisuje identyfikator obiektu i jego dane
    // nastepnie program tworzy zapytanie modyikujace tresc obiektu

    //public static final String UPDATE_STUDENT=



}

