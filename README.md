# Costa Rica Electoral Registry Data Parser & Network Query System

A robust Java application built with an **N-Tier Layered Architecture** to parse, process, and query massive electoral registry data from Costa Rica's Supreme Electoral Tribunal (TSE). The system supports dynamic local queries alongside multi-protocol network integration (**HTTP REST Endpoint** and **TCP Socket Server**), serializing responses into structured **JSON** and **XML** payloads.

---

## 🌟 Key Features

* **TSE Flat-File Parsing:** Processes raw electoral text data (`PADRON.TXT`) to extract citizen IDs, full names, and electoral codes efficiently.
* **Multi-Format Serialization:** Dynamically formats queried entities into **JSON** or **XML** payloads based on client request headers or parameters.
* **Multi-Protocol Access Points:**
  * **Interactive GUI:** Built with Java Swing for local testing, input validation, and real-time response inspection.
  * **HTTP REST API:** Handles GET requests over HTTP protocol (e.g., `http://localhost:9090/padron?cedula=305470104&format=json`).
  * **TCP Socket Server:** Processes raw TCP commands using custom network protocols (e.g., `GET|305470104|XML`).
* **Input Validation:** Built-in validation rules for Costa Rican identification numbers (*Cédula*).

---

## 🛠️ Tech Stack & Tools

* **Language:** Java (JDK 8+)
* **GUI Framework:** Java Swing
* **Networking & Protocols:** TCP/IP Sockets (`java.net`), HTTP Server (`com.sun.net.httpserver`)
* **Serialization:** JSON (Gson), XML (`javax.xml`)
* **Architecture:** Layered Architecture / Dependency Inversion Principle
* **IDE & Version Control:** NetBeans, Git, GitHub

---

## 🏗️ Project Architecture & Structure

The codebase strictly adheres to **Clean Architecture** principles, maintaining a decoupled separation of concerns across packages:

```text
src/
├── app/                  # Main Application Entry Point
│   └── Main.java
│
├── datos/                # Data Access Layer (Repository Interfaces & File I/O)
│   ├── RepositorioDistelec.java
│   ├── RepositorioDistelecArchivo.java
│   ├── RepositorioPadron.java
│   └── RepositorioPadronArchivo.java
│
├── dto/                  # Data Transfer Objects
│   ├── FormatoSalida.java
│   ├── RespuestaPadron.java
│   └── SolicitudPadron.java
│
├── entidades/            # Core Domain Entities
│   ├── Direccion.java
│   └── Persona.java
│
├── logica/               # Business Logic Layer (Services)
│   └── ServicioPadron.java
│
├── presentacion/         # Presentation Layer & Protocol Handlers
│   ├── gui/              # Swing Graphical User Interface
│   │   └── VentanaPrincipal.java
│   ├── http/             # REST HTTP Endpoint Handlers & Server
│   │   ├── PadronHttpHandler.java
│   │   └── ServidorHttp.java
│   └── tcp/              # TCP Sockets, Handlers & Command Parser
│       ├── ClienteTcpHandler.java
│       ├── ServidorTcp.java
│       └── SolicitudTcpParser.java
│
└── util/                 # Cross-cutting Utilities
    ├── Serializador.java # Dynamic JSON & XML Formatting
    └── ValidadorCedula.java

