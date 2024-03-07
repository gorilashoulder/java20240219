package ch06.lecture.p7access.exam14;


    public class Member {
        // 이름, 아이디, 패스워드, 나이

        private String name;
        private String id;
        private String password;
        private int age;

        public String getName() {
            return name;
        }

        public Member(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public void setName(String name, String namel) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


    }

