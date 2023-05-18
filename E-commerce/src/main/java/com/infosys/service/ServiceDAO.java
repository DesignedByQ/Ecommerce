package com.infosys.service;

import java.util.List;
import java.util.Map;

import com.infosys.dto.ProductDTO;
import com.infosys.dto.TagsDTO;

public interface ServiceDAO {
	
	List<ProductDTO> getProductsService();
	
	ProductDTO getProductService(Integer pk);
	
	String deleteProductService(Integer pk);
	
	ProductDTO addProductService(ProductDTO productDTO);

	TagsDTO addTagService(TagsDTO tagsDTO);
	
	List<TagsDTO> getTagsService();

//	
//	TeamDTO addTeamService(TeamDTO teamDTO);
//	
//	List<TeamDTO> getTeamService();
//	
//	String deletePlayerService(Integer sqnum);
//	
//	String deleteTeamService(Integer id);
//	
//	PlayerDTO getPlayerServiceById(Integer sqnum);
//	
//	TeamDTO getTeamServiceById(Integer id);
//	
//	PlayerDTO updatePlayerService(Integer sqnum, Map<String, Object> field);
//	
//	PlayerDTO replacePlayerService(Integer sqnum, PlayerDTO playerDTO);

}

