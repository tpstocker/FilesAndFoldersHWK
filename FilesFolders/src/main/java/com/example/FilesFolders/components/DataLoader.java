package com.example.FilesFolders.components;

import com.example.FilesFolders.models.File;
import com.example.FilesFolders.models.Folder;
import com.example.FilesFolders.models.User;
import com.example.FilesFolders.repositories.FileRepository;
import com.example.FilesFolders.repositories.FolderRepository;
import com.example.FilesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        User tom = new User("Tom");
        userRepository.save(tom);

        User hannah = new User("Hannah");
        userRepository.save(hannah);

        User alice = new User("Alice");
        userRepository.save(alice);

        User yevie = new User("Yevie");
        userRepository.save(yevie);

        User angus = new User("Angus");
        userRepository.save(angus);


        File file1 = new File("holiday_photos", ".png", 3);
        fileRepository.save(file1);

        File file2 = new File("todo_list", ".docx", 1);
        fileRepository.save(file2);

        File file3 = new File("personal_banking", ".xlx", 2);
        fileRepository.save(file3);


        Folder folder1 = new Folder("Photos");
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Admin");
        folderRepository.save(folder2);
    }
}
