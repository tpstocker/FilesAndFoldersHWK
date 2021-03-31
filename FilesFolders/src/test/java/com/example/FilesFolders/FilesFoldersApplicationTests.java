package com.example.FilesFolders;

import com.example.FilesFolders.models.File;
import com.example.FilesFolders.models.Folder;
import com.example.FilesFolders.models.User;
import com.example.FilesFolders.repositories.FileRepository;
import com.example.FilesFolders.repositories.FolderRepository;
import com.example.FilesFolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolderThenSave(){

		Folder folder1 = new Folder("Folder1");
		folderRepository.save(folder1);
		File file1 = new File("File1", ".png", 5);
		fileRepository.save(file1);
	}
}
