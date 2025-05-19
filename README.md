# 💸 BreakingBank

A full-stack modern banking system inspired by *Breaking Bad* — but way more secure (and legal). Built with **Java Spring Boot**, **MySQL**, and **React.js**, deployed with **Vercel/Netlify**.

---

## 🚀 Tech Stack

- **Frontend:** React.js, Axios, React Router  
- **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA  
- **Database:** MySQL  
- **Deployment:** Vercel/Netlify (frontend), Heroku/Render (backend)  
- **Tools:** IntelliJ, VSCode, MySQL Workbench, Postman  

---

## 🗺️ Roadmap

### ✅ 1. Project Setup
- [x] Create Spring Boot project (`spring initializr`)  
- [x] Create React app (`create-react-app`)  
- [x] Configure MySQL connection  

### ⛓️ 2. Database Design
- Users table (login, roles)  
- Accounts table (balance, type)  
- Transactions table (sender, receiver, amount, timestamp)  

### 🧠 3. Backend
- REST APIs for:  
  - User registration & login (with JWT)  
  - Account creation  
  - Fund transfer  
  - Transaction history  
- Spring Security for auth  
- Global exception handling  

### 🖥️ 4. Frontend
- React components: Login, Dashboard, Accounts, Transfer Funds  
- State management: Context API or Redux  
- API calls using Axios  
- Responsive UI with Material-UI or Bootstrap  

### 🧪 5. Testing
- Backend: JUnit, Mockito  
- Frontend: Jest, React Testing Library  

### 🌐 6. Deployment
- React on Vercel/Netlify  
- Spring Boot on Render/Heroku  
- MySQL on remote DB or Railway  

---

## 🔐 Features

- JWT-based authentication  
- Role-based access control (admin/user)  
- Fund transfers with validations  
- View account & transaction history  
- Clean UI and responsive dashboard  

---

## 🎓 Learning Resources

### 🎥 YouTube Playlists  
1. Bank App using Spring Boot + React – Vishal Code Zone  
   https://youtube.com/playlist?list=PLTAKw7_TH0_DkmjPtsUIlXJLTqGSJuIDx  
2. Spring Boot + React Series – LearnCodeWith Durgesh  
   https://youtube.com/playlist?list=PLbKub4Jss9oVSgCL6pFsiq0NLluRCDOdU  
3. React + Spring Boot Projects – Brototype Malayalam  
   https://youtube.com/playlist?list=PLOSbn7CZtRr5BHJ_LxZTJjNbBLk-vIMin  

### 🧰 GitHub Repos  
- Online Banking - Spring Boot + React  
  https://github.com/anshulghogre4/online-banking-springboot-react  
- Advanced Online Bank  
  https://github.com/Berko01/Advanced-Full-Stack-Project-With-Java-Spring-Boot-And-React-Redux-Online-Banking  
- Banking System - MongoDB version  
  https://github.com/abhishek-rabidas/Banking-System-Spring-Boot-React.js-M  

### 📘 Official Docs  
- Spring Boot Docs  
  https://docs.spring.io/spring-boot/docs/current/reference/html/  
- Spring Security Docs  
  https://docs.spring.io/spring-security/reference/index.html  
- Spring Data JPA  
  https://docs.spring.io/spring-data/jpa/docs/current/reference/html/  
- React Docs  
  https://reactjs.org/docs/getting-started.html  
- MySQL Docs  
  https://dev.mysql.com/doc/  
- Axios GitHub  
  https://github.com/axios/axios  
- Vercel Docs  
  https://vercel.com/docs  
- Netlify Docs  
  https://docs.netlify.com/  
- Render Docs  
  https://render.com/docs  

---

## 📂 Sample Configurations

### application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/breakingbank
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.security.user.name=admin
spring.security.user.password=admin123
jwt.secret=your_jwt_secret_key
