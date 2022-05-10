package tn.esprit.spring.service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.spring.entity.FileDb;
import tn.esprit.spring.entity.FileResponse;
import tn.esprit.spring.repository.FileDbRepository;

@Service
public class FileDbService {
	
	@Autowired
	private FileDbRepository fileDbRepository;
	
	
	
	private String uploadFolderPath = "c:/salma/";
    

        
    
	
	
	public FileResponse store(MultipartFile file) throws IOException {
		
		try {
            byte[] data = file.getBytes();
            Path path = Paths.get(uploadFolderPath + file.getOriginalFilename());
            Files.write(path, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		String path = uploadFolderPath +file.getOriginalFilename();
		String fileName = file.getOriginalFilename();
		FileDb fileDb = new FileDb(UUID.randomUUID().toString(), fileName, file.getContentType(),path, file.getBytes());
		fileDbRepository.save(fileDb);
		return  mapToFileResponse(fileDb);
	}
	
	public FileDb getFileById(String id) {
		
		Optional<FileDb> fileOptional = fileDbRepository.findById(id);
		
		if(fileOptional.isPresent()) {
			return fileOptional.get();
		}
		return null;
	}
	
	public List<FileResponse> getFileList(){
		return fileDbRepository.findAll().stream().map(this::mapToFileResponse).collect(Collectors.toList());
	}
	
	private FileResponse mapToFileResponse(FileDb fileDb) {
		return new FileResponse(fileDb.getId(), fileDb.getType(), fileDb.getName(), fileDb.getPath(),fileDb.getNom_de_demande(),fileDb.getDateAchat());
	}
	

}
