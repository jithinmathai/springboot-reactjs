# Spring Boot + React (Vite)

A minimal setup that packages both a Spring Boot backend and a React (Vite) frontend into a single JAR.

## Overview

- **Backend:** Spring Boot 4.0.3 (Java 25, Spring Framework 7)
- **Frontend:** React 19.2 + Vite 8.0
- **Packaging:** React build output is copied to `src/main/resources/static`
- **API:** Sample endpoint at `/api/hello`

## Tech Stack

| Layer           | Technology                | Version |
|-----------------|---------------------------|---------|
| Backend         | Spring Boot               | 4.0.3   |
| Framework       | Spring Framework          | 7.0.x   |
| Language        | Java                      | 25      |
| Frontend        | React                     | 19.2.4  |
| Build (FE)      | Vite                      | 8.0.1   |
| Vite Plugin     | @vitejs/plugin-react      | 6.0.1   |
| Build (BE)      | Maven                     | 3.6.3+  |

## Requirements

- Java 25
- Node.js 22+ & npm
- Maven 3.6.3+

## Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/springboot-react.git
   cd springboot-react
   ```

2. **Install and run the frontend (dev mode):**

   ```bash
   cd frontend
   npm install
   npm run dev
   ```

   Visit [http://localhost:5173](http://localhost:5173) for the dev server.

3. **Build the entire project with Maven:**

   ```bash
   mvn clean package
   ```

   This automatically installs Node/npm, runs `npm install`, and builds the React app into `src/main/resources/static`.

## Run

After building, run the generated JAR:

```bash
java -jar target/springboot-react-0.0.1-SNAPSHOT.jar
```

- **Frontend:** [http://localhost:8080](http://localhost:8080)
- **API:** [http://localhost:8080/api/hello](http://localhost:8080/api/hello)

## Customize

- **Backend:** Add more controllers in `src/main/java`
- **Frontend:** Edit the React app in the `frontend` folder

## License

MIT. See [LICENSE](LICENSE).
