package ch01_stratigy.walid;

import java.util.*;

public class UserSortSolution {


    /* ************ PROBLEM ****************
    You are given a list of users and their skills
    You have to format these in such a way so that the result matches
    with the expectedOutput given here.

    Notes:
    Even index's value will be list of skills
    Odd index's value will be list of users
    Both the user names and skills should be sorted alphabetically.
    User(s) with more skills takes the priority
    If the number of skills for multiple group of users are same,
    group with larger member takes the priority

    Add On:
    If both the number of skills and users are the same, sort them alphabetically
    based on the first element of the skills

    type User = {
      id: number,
      name: string,
    };

    const users: User[] = [
      { id: 1, name: 'Josh' },
      { id: 2, name: 'Daniel' },
      { id: 3, name: 'Nick' },
      { id: 4, name: 'Jamie' },
      { id: 5, name: 'Rich' },
      { id: 6, name: 'Brian' },
    ];

    type UserSkill = {
      userId: number,
      skill: string,
    };

    const userSkills: UserSkill[] = [
      { userId: 6, skill: 'DevOps' },
      { userId: 6, skill: 'Python' },
      { userId: 6, skill: 'Java' },
      { userId: 5, skill: 'Java' },
      { userId: 5, skill: 'Python' },
      { userId: 4, skill: 'C#' },
      { userId: 3, skill: 'Python' },
      { userId: 3, skill: 'Java' },
      { userId: 1, skill: 'Python' },
      { userId: 1, skill: 'TypeScript' },
      { userId: 2, skill: 'Python' },
    ];

    const expectedOutput = [
      ['DevOps', 'Java', 'Python'],
      ['Brian'],
      ['Java', 'Python'],
      ['Nick', 'Rich'],
      ['Python', 'TypeScript'],
      ['Josh'],
      ['C#'],
      ['Jamie'],
      ['Python'],
      ['Daniel'],
    ];
     */

    public static void main(String[] args){

        User[] users = {new User(1, "Josh"),
                new User(2, "Daniel"),
                new User(3, "Nick"),
                new User(4, "Jamie"),
                new User(5, "Rich"),
                new User(6, "Brian")};
        UserSkill[] userSkills = {
                new UserSkill(6, "DevOps"),
                new UserSkill(6, "Python"),
                new UserSkill(6, "Java"),
                new UserSkill(5, "Java"),
                new UserSkill(5, "Python"),
                new UserSkill(4, "C#"),
                new UserSkill(3, "Python"),
                new UserSkill(3, "Java"),
                new UserSkill(1, "Python"),
                new UserSkill(1, "TypeScript"),
                new UserSkill(2, "Python")
        };

        Map<Integer, ArrayList<String>> idSkillMap = new HashMap<>();
        for (UserSkill skill : userSkills){
            if (!idSkillMap.containsKey(skill.userId))
                idSkillMap.put(skill.userId, new ArrayList<>());
            idSkillMap.get(skill.userId).add(skill.skillName);
        }

        for (int id : idSkillMap.keySet()) {
            Collections.sort(idSkillMap.get(id));
        }

        Map<ArrayList<String>, ArrayList<String>> skillNameMap = new HashMap<>();
        Set<ArrayList<String>> skillSet = new HashSet<>();
        for (Integer id : idSkillMap.keySet()){
            ArrayList<String> skillArrayList = idSkillMap.get(id);
            if (!skillSet.contains(skillArrayList)){
                ArrayList<String> nameList = new ArrayList<>();
                nameList.add(users[id-1].name);
                skillNameMap.put(skillArrayList, nameList);
                skillSet.add(skillArrayList);
            }else{
                skillNameMap.get(skillArrayList).add(users[id-1].name);
            }
        }

        ArrayList<SkillNameList> finalList = new ArrayList<>();
        for (ArrayList<String> list : skillNameMap.keySet()) {
            Collections.sort(skillNameMap.get(list));
            finalList.add(new SkillNameList(list, skillNameMap.get(list)));
        }

        finalList.sort((a, b) -> {
            if (a.skillList.size() > b.skillList.size()) return -1;
            else if (a.skillList.size() == b.skillList.size())
                return a.userList.get(0).compareTo(b.userList.get(0)) > 0 ? -1 : 1;
            else return 1;
        });

        System.out.println(finalList);
    }


    private static class User{

        public User(int id, String name){
            this.id = id;
            this.name = name;
        }
        public int id;
        public String name;
    }

    private static class UserSkill{
        public UserSkill(int userId, String skillName) {
            this.userId = userId;
            this.skillName = skillName;
        }

        public int userId;
        public String skillName;
    }

    private static class SkillNameList{
        public ArrayList<String> skillList;
        public ArrayList<String> userList;

        public SkillNameList(ArrayList<String> skillList, ArrayList<String> userList) {
            this.skillList = skillList;
            this.userList = userList;
        }

        @Override
        public String toString() {
            return  skillList + ", " + userList;
        }
    }
}
