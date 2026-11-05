# Spring Boot + React (Vite)

A minimal setup that packages both a Spring Boot backend and a React (Vite) frontend into a single JAR.

## Overview

- **Backend:** Spring Boot 4.1.2 (Java 25 LTS, Spring Framework 7)
- **Frontend:** React 19.3 + Vite 8.3
- **Packaging:** React build output is copied to `src/main/resources/static`
- **API:** Sample endpoint at `/api/hello`

## Tech Stack

| Layer           | Technology                | Version |
|-----------------|---------------------------|---------|
| Backend         | Spring Boot               | 4.1.2   |
| Framework       | Spring Framework          | 7.0.x   |
| Language        | Java                      | 25 (LTS)|
| Frontend        | React                     | 19.3.1  |
| Build (FE)      | Vite                      | 8.3.5   |
| Vite Plugin     | @vitejs/plugin-react      | 6.2.1   |
| Build (BE)      | Maven                     | 3.6.3+  |

## Requirements

- Java 25
- Node.js 26 LTS & npm 11 are auto-installed for the Maven build; for `npm run dev` use Node ^20.19, ^22.13 or >=24
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
