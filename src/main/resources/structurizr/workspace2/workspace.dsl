
workspace "Example workspace" "This is an example workspace to illustrate the key features of Structurizr" {

   model {
       properties {
           "structurizr.groupSeparator" "/"
       }

       user = person "User"

       system1 = softwareSystem "System 1" {
            service1 = container "web-service1"  ""  "Go"
            service2 = container "web-service2"  "Saves data to db"  "Java"
            database = container "database"  "Keeps data"  "MySQL" "Database"

           service1 -> service2 "Sends data" "HTTP/REST"
           service2 -> database "Saves data" "JDBC/SQL"
       }

       system2 = softwareSystem "System 2" {
            python = container "Python Script" "Provides Audit" "Python"
       }

       user -> service1 "Sends Data" "HTTP/REST"
       python -> database "Queries data for audit" "SQL"
   }

  views {
      systemlandscape "systemLandscape" {
          include *
          autolayout
      }

//      systemContext system1 {
//          include *
//          autolayout
//      }

      container system1 {
          include *
          autolayout
          description "The container diagram for the System1."
      }

      container system2 {
          include *
          autolayout
           description "The container diagram for the System2."
      }

       theme default
  }
}