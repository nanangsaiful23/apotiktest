# MavenElevator

Step untuk mengatur maven + sonnarcube

1. Download maven disini
  http://www-eu.apache.org/dist/maven/maven-3/3.5.2/binaries/apache-maven-3.5.2-bin.zip
  lalu extract ke folder yang diinginkan,
2. Download sonarqube
  https://sonarsource.bintray.com/Distribution/sonarqube/sonarqube-6.7.zip
  lalu extract ke folder yang diinginkan, pergi ke folder
  "C:\sonarqube-6.7\bin\windows-x86-64" sesuaikan folder dengan tempat dimana anda mengekstrak sonar!
  Lalu jalankan "StartSonar.bat"
  ## Selesai, sonar telah berhasil dijalankan, dapat diakses di localhost:9000 melalui web browser!
3. Tambahkan maven ke environment variables
  Step nya : 
  Tekan start, cari "environment variables"
  Klik "Environment Variables..."
      
  <a href="https://imgbb.com/"><img src="https://image.ibb.co/maWHkw/image.png" alt="image" border="0">
      
  Cari variable "path"
  Klik edit
  
  <a href="https://imgbb.com/"><img src="https://image.ibb.co/c6Vckw/image.png" alt="image" border="0"></a><br />
      
  Tambahkan direktori dimana anda mengekstrak maven
  
  <a href="https://imgbb.com/"><img src="https://image.ibb.co/nN4L5w/image.png" alt="image" border="0">
      
   ## Pastikan tampilannya sudah seperti ini!
4. Pastikan maven sudah terinstall dengan cara buka cmd dan ketik "mvn -v"
      
  <a href="https://ibb.co/hS1YQw"><img src="https://preview.ibb.co/c3x7kw/image.png" alt="image" border="0">
    
5. Jika sudah terinstall, buka folder tempat kalian mengextract maven, dan cari folder "conf"
      
  <a href="https://ibb.co/kGPbdG"><img src="https://preview.ibb.co/g2mpyG/image.png" alt="image" border="0">
    
6. Download file settings.xml dan replace settings.xml yang ada.

    Download disini!
    
    https://nofile.io/f/7F4f4UVS1h6/settings.xml
    
    
7. Buka folder project, dan buka cmd di folder tersebut
8. Ketikkan perintah "mvn sonar:sonar"
9. Done!
