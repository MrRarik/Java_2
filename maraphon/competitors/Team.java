// Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
// (т.е. в конструкторе можно сразу всех участников указывать),
// метод для вывода информации о членах команды прошедших дистанцию,
// метод вывода информации обо всех членах команды.

package maraphon.competitors;

public class Team {

    String name;
    Competitor[] competitor;
    StringBuilder resultatInTeam;

    public Team(String name, Competitor... competitor) {
        this.name = name;
        this.competitor = competitor;
        this.resultatInTeam = new StringBuilder();
    }


    public Competitor[] getCompetitor() {
        return competitor;
    }

    public void setResult(String result) {
        resultatInTeam.append(result).append("\n");
    }

    public void showResults() {
        System.out.println("Команда: " + name);
        System.out.println("Результаты: ");
        System.out.print(resultatInTeam);
    }
}
