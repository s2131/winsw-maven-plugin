File executableFile = new File(basedir, 'target/simple-it2-1.0-SNAPSHOT.exe')

assert executableFile.exists()

File configurationFile = new File(basedir, 'target/simple-it2-1.0-SNAPSHOT.xml')

assert configurationFile.exists()
