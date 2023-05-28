package com.company.objectClassAndMethods;

public class NotebookShop {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Apple", 123));
        dataStore.add(new Computer("Asus", 1));
        dataStore.add(new Computer("Apple", 123));
        dataStore.add(new Computer("Acer", 24));
        dataStore.add(new Computer("Apple", 123));

        Computer computerToFind = new Computer("Apple", 123);
        int computersFound = dataStore.checkAvailability(computerToFind);
        System.out.println("Searching computer: " + computerToFind + "is available in following quantities: " + computersFound);

        System.out.println("All available computers in store:");
        for (Computer comp: dataStore.getComputers()) {
            System.out.println(comp);
        }
    }
}
