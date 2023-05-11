package com.example.asianfoodandroid.recipes.db;

import java.util.*;

public class MemoryRecipeRepository {
 private final Map<String, String> storage = new HashMap<>();

 public MemoryRecipeRepository() {
  storage.put("Szparagi z sosem",
          "Składniki:\n" +
                  "szparagi \t 2 pęczki\n" +
                  "jajka \t 3 sztuki\n" +
                  "Bulion warzywny \t 1 sztuka\n" +
                  "masło klarowane \t 250 mililitrów\n" +
                  "cukier \t 1 łyżeczka\n" +
                  "świeżo mielony biały pieprz\n" +
                  "sok z 1 cytryny \t 50 mililitrów\n\n" +
                  "Krok 1\n" +
                  "Szparagi umyj, odetnij zdrewniałe końcówki, resztę szparagów obierz. W garnku nastaw doprawioną solą i cukrem wodę. Gdy woda zacznie się gotować, włóż do niej szparagi, gotuj zielone około 4 minut, a białe około 6 minut.\n" +
                  "\n" +
                  "Krok 2\n" +
                  "Przygotuj sos: będziesz potrzebował trzepaczkę, garnek i metalową miskę o średnicy nieco większej niż garnek.\n" +
                  "\n" +
                  "Krok 3\n" +
                  "Klarowane masło rozgrzej do temperatury około 60 stopni. Ma być ciepłe, nie gorące. W odpowiednim garnku zagotuj wodę. Do miski wbij żółtko jajek, dodaj cukier , kostkę rosołową, sok z cytryny. Miskę umieść na garnku, w kąpieli parowej. Powoli dodając masło, ucieraj je energicznie mieszając z żółtkami. Kontroluj przy tym temperaturę, gdyż w zbyt wysokiej jajka się po prostu zetną.\n" +
                  "\n" +
                  "Krok 4\n" +
                  "Masło dodawaj do momentu, aż sos stanie się puszysty i zgęstnieje. Przełóż go wtedy do miski, dopraw białym pieprzem. Ugotowane szparagi podawaj polane sosem.");

 }

 public Set<String> getAllRecipesNames () {
  return storage.keySet();
 }

 public Optional<String> getDescription(String Name) {
  return Optional.ofNullable(storage.get(Name));
 }

}
