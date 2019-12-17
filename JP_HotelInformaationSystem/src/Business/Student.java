/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author yizhe
 */
public class Student {
        private String Id;
        private String Name;
        private String Sex;
        private String Age;

        Student(String Name, String Sex, String Age) {
            this.Id = null; //default
            this.Name = Name;
            this.Sex = Sex;
            this.Age = Age;
        }

        public String getId() {
            return Id;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getSex() {
            return Sex;
        }

        public void setSex(String Sex) {
            this.Sex = Sex;
        }

        public String getAge() {
            return Age;
        }

        public void setage(String Age) {
            this.Age = Age;
        }
}
