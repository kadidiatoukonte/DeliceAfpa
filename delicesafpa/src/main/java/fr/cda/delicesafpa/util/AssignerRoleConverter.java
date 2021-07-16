package fr.cda.delicesafpa.util;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.AssignerRoleId;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.dto.AssignerRoleDTO;
import fr.cda.delicesafpa.interfaceServ.AssignerRoleServiceI;

@Component
public class AssignerRoleConverter {

	public static AssignerRoleDTO explicitModelMappingDemoDaotoDto(AssignerRole assignerRole) {

		AssignerRoleDTO targetARDTO = new AssignerRoleDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.addMappings(new PropertyMap<AssignerRole, AssignerRoleDTO>() {
			protected void configure() {
				

				map().setDate(source.getId().getDate());
				;
			}
		});

		modelMapper.map(assignerRole, targetARDTO);

		System.out.println(targetARDTO.getDate());
		System.out.println(targetARDTO.getIdemploye());
		System.out.println(targetARDTO.getIdemploye_assigner_role());
		System.out.println(targetARDTO.getIdstatus());
		return targetARDTO;
	}

	
	
	
	public static AssignerRole convertToEntity(AssignerRoleDTO assignerRoleDTO) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();
		AssignerRole post = modelMapper.map(assignerRoleDTO, AssignerRole.class);
		post.setId(new AssignerRoleId(
				assignerRoleDTO.getIdemploye_assigner_role().getIdemploye(),
				assignerRoleDTO.getIdemploye().getIdemploye(),
				assignerRoleDTO.getIdstatus().getIdstatus(),
				assignerRoleDTO.getDate()));
		
	 
	    return post;
	}
}
