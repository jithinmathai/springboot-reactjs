

 # Spring Boot + React (Vite)                          
                                                     
 A minimal setup that packages both a Spring Boot     
 backend and a React (Vite) frontend into a single JAR. 
                                                     
 ## Overview                                         
                                                     
 - **Backend:** Spring Boot (Java 23)                
 - **Frontend:** React + Vite                        
 - **Packaging:** React build output is copied to    
   `src/main/resources/static`                       
 - **API:** Sample endpoint at `/api/hello`          
                                                     
 ## Requirements                                     
                                                     
 - Java 23 (or a compatible JDK)                     
 - Node.js & npm                                   
 - Maven                                             
                                                     
 ## Setup                                            
                                                     
 1. **Clone the repository:**                        
                                                     
    ```bash                                        
    git clone https://github.com/yourusername/springboot-react.git 
    cd springboot-react                             
    ```                                             
                                                     
 2. **Install and run the frontend:**                
                                                     
    ```bash                                        
    cd frontend                                    
    npm install                                    
    npm run dev                                    
    ```                                             
                                                     
    (Optional: Visit [http://localhost:5173](http://localhost:5173))
                                                     
 3. **Build the production frontend:**              
                                                     
    ```bash                                        
    npm run build                                  
    ```                                             
                                                     
 4. **Build the entire project with Maven:**        
                                                     
    ```bash                                        
    mvn clean package                              
    ```                                             
                                                     
 ## Run                                              
                                                     
 After building, run the generated JAR:              
                                                     
 ```bash                                           
 java -jar target/springboot-react-0.0.1-SNAPSHOT.jar  
 ```                                               
                                                     
 - **Frontend:** Open [http://localhost:8080](http://localhost:8080)  
 - **API:** Open [http://localhost:8080/api/hello](http://localhost:8080/api/hello) 
                                                     
 ## Customize                                        
                                                     
 - **Backend:** Add more controllers in `src/main/java` 
 - **Frontend:** Edit the React app in the `frontend` folder 
                                                     
 ## License                                          
                                                     
 MIT. See [LICENSE](LICENSE).                         

You can use this simulated view as a reference in your editor. If you have any issues or need further adjustments, please let me know!
