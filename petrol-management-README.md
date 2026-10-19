# ⛽ Petrol Management System

A desktop application built with **JavaFX** to manage daily operations of a petrol station — fuel records, employee management, sales reports, and stock tracking.

![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-%235372A4.svg?style=for-the-badge&logo=java&logoColor=white)
![Storage](https://img.shields.io/badge/Storage-File%20Based-orange?style=for-the-badge)

---

## ✨ Features

### 🔐 Login System
- Secure login page with role-based access
- Separate dashboards for **Admin** and **Employee**

### 👑 Admin Dashboard
| Module | Description |
|--------|-------------|
| ⛽ Manage Fuel | Enter and manage fuel records |
| 📋 Fuel Check Records | View complete fuel entry history |
| 👷 Employees | Add and manage employee records (name, ID, role, salary, shift) |
| 📊 Sales Report | Track and review station sales |
| 🛢️ Fuel Stock | Monitor current fuel inventory |
| 💰 Daily Balance | View day-to-day financial summary |
| 📈 Charts & Graphs | Visualize fuel and sales data |
| 👤 Admin Profile | Manage admin account details |
| 💳 Recharge Employee Card | Recharge employee fuel cards |

### 👷 Employee Page
- Add employee details: **Name, ID, Role, Salary, Shift**
- View all saved employee records
- Clear form and navigate easily between pages

---

## 🛠️ Tech Stack

- **Language:** Java
- **GUI Framework:** JavaFX
- **Styling:** CSS (`style.css`)
- **Data Storage:** File-based (`.txt` files via `FileStorage`)

---

## 📁 Project Structure

```
PetrolManagementSystem/
├── Main.java            # Application entry point
├── LoginPage.java       # Login screen
├── AdminDashboard.java  # Admin main menu (10 modules)
├── EmployeePage.java    # Employee management page
├── FileStorage.java     # File read/write utility
├── storage.txt          # Data storage file
└── style.css            # Application styling
```

---

## 🚀 How to Run

### Prerequisites
- JDK 17 or later
- JavaFX SDK ([download](https://gluonhq.com/products/javafx/))

### Option 1 — IDE (IntelliJ IDEA / NetBeans / Eclipse)
1. Open the project in your IDE
2. Add the JavaFX SDK to your project libraries
3. Set `Main.java` as the main class
4. Add VM options (see below) and run

**VM options:**
```
--module-path "C:\path\to\javafx-sdk-XX\lib" --add-modules javafx.controls,javafx.fxml
```

### Option 2 — Terminal

**Windows:**
```bash
javac --module-path "C:\path\to\javafx-sdk\lib" --add-modules javafx.controls *.java
java --module-path "C:\path\to\javafx-sdk\lib" --add-modules javafx.controls Main
```

> ⚠️ **Note:** If your JavaFX SDK version differs, adjust the paths and module list accordingly.

---

## 🔑 Default Login Credentials

<!-- TODO: Fill in your actual login credentials -->

| Role | Username | Password |
|------|----------|----------|
| Admin | `admin` | `admin` |

---

## 🗄️ Data Storage

This project uses **simple file-based storage** — all records (fuel entries, employees, etc.) are saved to `.txt` files via the `FileStorage` class. No database required — perfect for learning, and easy to upgrade later.

---

## 📸 Screenshots

<!-- Add screenshots of your app here -->
<!-- ![Login Page](screenshots/login.png) -->
<!-- ![Admin Dashboard](screenshots/dashboard.png) -->

---

## 🔮 Future Improvements

- [ ] Replace file storage with **MySQL / SQLite** database
- [ ] Add input validation and error handling
- [ ] Generate printable PDF sales reports
- [ ] Employee attendance tracking
- [ ] Dark mode 🌙

---

## 👨‍💻 Author

**Rayaan-ur Rehman**
- GitHub: [@rayaanrehman624-ops](https://github.com/rayaanrehman624-ops)
- Email: [rayaanrehman624@gmail.com](mailto:rayaanrehman624@gmail.com)

---

⭐ If you like this project, give it a star!
