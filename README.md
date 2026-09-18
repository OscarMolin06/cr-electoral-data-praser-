# Costa Rica Electoral Registry Parser & Query Engine

A Java application designed to process Costa Rica's official electoral registry (TSE) from flat text files. It supports local queries via a graphical interface as well as remote requests through an HTTP server (REST API) and TCP sockets, returning citizen data serialized in JSON or XML formats.


## Features

* **Electoral Registry Parsing:** Efficiently reads and parses raw PADRON.TXT files provided by TSE to extract ID numbers, full names, and electoral codes.
* **Multiple Output Formats:** Dynamically serializes payload responses into **JSON** or **XML** based on client requests.
* **Three Access Methods:**
  * **GUI (Java Swing):** Graphical interface for local testing and manual lookup.
  * **HTTP Endpoint:** Integrated HTTP server handling RESTful GET requests (e.g., http://localhost:9090/padron?cedula=305470104&format=json).
  * **TCP Server:** Socket communication processing custom commands (e.g., GET|305470104|XML).
* **Validation:** Built-in logic to validate Costa Rican national ID formats before initiating search operations.


## Tech Stack

* **Language:** Java (JDK 8+)
* **GUI:** Java Swing
* **Networking:** TCP Sockets (java.net), HTTP Server (com.sun.net.httpserver)
* **Libraries:** Gson (JSON serialization)
* **Environment:** NetBeans / Git


