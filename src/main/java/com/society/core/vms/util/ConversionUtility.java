package com.society.core.vms.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.society.core.vms.dto.AdvanceVisitorRequestDTO;
import com.society.core.vms.dto.CityDTO;
import com.society.core.vms.dto.CountryDTO;
import com.society.core.vms.dto.DailyVisitorDTO;
import com.society.core.vms.dto.DistrictDTO;
import com.society.core.vms.dto.EnrolmentData;
import com.society.core.vms.dto.FlatDTO;
import com.society.core.vms.dto.GlobalUserDTO;
import com.society.core.vms.dto.MenuLinkDTO;
import com.society.core.vms.dto.NeibourhoodEmployeeDTO;
import com.society.core.vms.dto.NeibourhoodTypeDTO;
import com.society.core.vms.dto.NeighbourhoodDTO;
import com.society.core.vms.dto.NeighbourhoodPassDetailDTO;
import com.society.core.vms.dto.Neighbourhood_PassTypeDTO;
import com.society.core.vms.dto.NotificationActionButtonDTO;
import com.society.core.vms.dto.NotificationDTO;
import com.society.core.vms.dto.NotificationTypeDTO;
import com.society.core.vms.dto.RoleDTO;
import com.society.core.vms.dto.SocietyDTO;
import com.society.core.vms.dto.StaffDTO;
import com.society.core.vms.dto.StateDTO;
import com.society.core.vms.dto.VisitorDTO;
import com.society.core.vms.dto.VoteActionButtonDTO;
import com.society.core.vms.dto.VoteDTO;
import com.society.core.vms.dto.VoteSubjectDTO;
import com.society.core.vms.dto.VoteTypeDTO;
import com.society.core.vms.entity.AdvanceVisitorRequest;
import com.society.core.vms.entity.City;
import com.society.core.vms.entity.Country;
import com.society.core.vms.entity.DailyVisitor;
import com.society.core.vms.entity.District;
import com.society.core.vms.entity.Flat;
import com.society.core.vms.entity.GlobalUser;
import com.society.core.vms.entity.MenuLink;
import com.society.core.vms.entity.NeibourhoodEmployee;
import com.society.core.vms.entity.NeibourhoodType;
import com.society.core.vms.entity.Neighbourhood;
import com.society.core.vms.entity.NeighbourhoodPassDetail;
import com.society.core.vms.entity.Neighbourhood_PassType;
import com.society.core.vms.entity.Notification;
import com.society.core.vms.entity.NotificationActionButton;
import com.society.core.vms.entity.NotificationType;
import com.society.core.vms.entity.Role;
import com.society.core.vms.entity.Society;
import com.society.core.vms.entity.SocietyEnrolment;
import com.society.core.vms.entity.Staff;
import com.society.core.vms.entity.State;
import com.society.core.vms.entity.Visitor;
import com.society.core.vms.entity.VisitorType;
import com.society.core.vms.entity.Vote;
import com.society.core.vms.entity.VoteActionButton;
import com.society.core.vms.entity.VoteSubject;
import com.society.core.vms.entity.VoteType;

public class ConversionUtility {

	/**
	 * Utility method converts GlobalUser (entity) to Data object.
	 * 
	 * @param entity
	 * @return DTO
	 */
	public static GlobalUserDTO entityToDataObject(GlobalUser entity) {
		if (null == entity) {
			return null;
		}
		GlobalUserDTO dto = new GlobalUserDTO();
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setMiddleName(entity.getMiddleName());
		dto.setAadharNo(entity.getAadharNo());
		dto.setAddCountry(entity.getAddCountry());
		dto.setAddDistrict(entity.getAddDistrict());
		dto.setAddPin(entity.getAddPin());
		dto.setAddState(entity.getAddState());
		dto.setAge(entity.getAge());
		dto.setAlternativePhone(entity.getAlternativePhone());
		dto.setBloodGroup(entity.getBloodGroup());
		dto.setComment(entity.getComment());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setDob(entity.getDob());
		dto.setIdType(entity.getIdType());
		dto.setIsDeleted(entity.getIsDeleted());
		dto.setIsEnabled(entity.getIsEnabled());
		dto.setMemberSince(entity.getMemberSince());
		dto.setPanNo(entity.getPanNo());
		dto.setParentId(entity.getParentId());
		dto.setPhoneImei(entity.getPhoneImei());
		dto.setPhotoPath(entity.getPhotoPath());
		dto.setReferedBy(entity.getReferedBy());
		dto.setSex(entity.getSex());
		dto.setSsn(entity.getSsn());
		dto.setUserAddress(entity.getUserAddress());
		dto.setUserDl(entity.getUserDl());
		dto.setUserEmail(entity.getUserEmail());
		dto.setUserGroup(entity.getUserGroup());
		dto.setUserId(entity.getUserId());
		dto.setUserName(entity.getUserName());
		dto.setUserPhone(entity.getUserPhone());

		return dto;
	}

	/**
	 * Utility method converts GlobalUserDTO (Data object) to entity.
	 * 
	 * @param dto
	 * @return Entity
	 */
	public static GlobalUser dataObjectToEntity(GlobalUserDTO dto) {
		if (null == dto) {
			return null;
		}

		GlobalUser entity = new GlobalUser();

		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setMiddleName(dto.getMiddleName());
		entity.setAadharNo(dto.getAadharNo());
		entity.setAddCountry(dto.getAddCountry());
		entity.setAddDistrict(dto.getAddDistrict());
		entity.setAddPin(dto.getAddPin());
		entity.setAddState(dto.getAddState());
		entity.setAge(dto.getAge());
		entity.setAlternativePhone(dto.getAlternativePhone());
		entity.setBloodGroup(dto.getBloodGroup());
		entity.setComment(dto.getComment());
		entity.setCreatedBy(dto.getCreatedBy());
		entity.setDob(dto.getDob());
		entity.setIdType(dto.getIdType());
		entity.setIsDeleted(dto.getIsDeleted());
		entity.setIsEnabled(dto.getIsEnabled());
		entity.setMemberSince(dto.getMemberSince());
		entity.setPanNo(dto.getPanNo());
		entity.setParentId(dto.getParentId());
		entity.setPhoneImei(dto.getPhoneImei());
		entity.setPhotoPath(dto.getPhotoPath());
		entity.setReferedBy(dto.getReferedBy());
		entity.setSex(dto.getSex());
		entity.setSsn(dto.getSsn());
		entity.setUserAddress(dto.getUserAddress());
		entity.setUserDl(dto.getUserDl());
		entity.setUserEmail(dto.getUserEmail());
		entity.setUserGroup(dto.getUserGroup());
		entity.setUserId(dto.getUserId());
		entity.setUserName(dto.getUserName());
		entity.setUserPhone(dto.getUserPhone());

		return entity;
	}

	/**
	 * Utility method converts List of GlobalUserDTO (Data objects) to entity.
	 * 
	 * @param entities
	 * @return
	 */
	public static List<GlobalUserDTO> entityToDataObject(List<GlobalUser> entities) {
		List<GlobalUserDTO> dtos = new ArrayList<>();

		for (GlobalUser entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	/**
	 * Utility method converts List of GlobalUser (entity) to Data objects.
	 * 
	 * @param dtos
	 * @return list of Data objects
	 */
	public static List<GlobalUser> dataObjectToEntity(List<GlobalUserDTO> dtos) {
		List<GlobalUser> entities = new ArrayList<GlobalUser>();

		for (GlobalUserDTO dto : dtos) {
			entities.add(dataObjectToEntity(dto));
		}
		return entities;
	}

	/**
	 * Utility method converts List of Flat (entity) to Data objects.
	 * 
	 * @param flats
	 * @return
	 */
	public static List<FlatDTO> flatEntityToDataObject(List<Flat> entities) {

		List<FlatDTO> dtos = new ArrayList<FlatDTO>();
		for (Flat flat : entities) {
			dtos.add(entityToDataObject(flat));
		}
		return dtos;
	}

	public static FlatDTO entityToDataObject(Flat entity) {

		if (null == entity) {
			return null;
		}
		FlatDTO dto = new FlatDTO();
		dto.setAreaSqrft(entity.getAreaSqrft());
		dto.setBlock(entity.getBlock());
		dto.setFlatDescription(entity.getFlatDescription());
		dto.setFlatId(entity.getFlatId());
		dto.setFlatIntercomPhone(entity.getFlatIntercomPhone());
		dto.setFlatName(entity.getFlatName());
		dto.setFlatType(entity.getFlatType());
		dto.setFloor(entity.getFloor());
		dto.setResidentName(entity.getResidentName());
		dto.setOwnerResiding(entity.isOwnerResiding());
		dto.setVaccant(entity.isVaccant());
		dto.setNoOfResident(entity.getNoOfResident());
		dto.setOccupiedDate(entity.getOccupiedDate());
		dto.setOwnerPhone(entity.getOwnerPhone());
		dto.setParkingArea(entity.getParkingArea());
		dto.setSocietyId(entity.getSocietyId());
		dto.setTennantId(entity.getTennantId());
		dto.setTennantName(entity.getTennantName());
		dto.setUserPass(entity.getUserPass());
		dto.setVaccantDate(entity.getVaccantDate());

		return dto;
	}

	public static List<Flat> flatDataObjectToEntity(List<FlatDTO> dtos) {

		List<Flat> entities = new ArrayList<>();
		for (FlatDTO dto : dtos) {
			entities.add(dataObjectToentity(dto));
		}
		return entities;
	}

	public static Flat dataObjectToentity(FlatDTO dto) {

		Flat entity = new Flat();
		entity.setAreaSqrft(dto.getAreaSqrft());
		entity.setBlock(dto.getBlock());
		entity.setFlatDescription(dto.getFlatDescription());
		entity.setFlatId(dto.getFlatId());
		entity.setFlatIntercomPhone(dto.getFlatIntercomPhone());
		entity.setFlatName(dto.getFlatName());
		entity.setFlatType(dto.getFlatType());
		entity.setFloor(dto.getFloor());
		entity.setResidentName(dto.getResidentName());
		entity.setResidentPhone(dto.getResidentPhone());
		entity.setOwnerResiding(dto.isOwnerResiding());
		entity.setVaccant(dto.isVaccant());
		entity.setNoOfResident(dto.getNoOfResident());
		entity.setOccupiedDate(dto.getOccupiedDate());
		entity.setOwnerId(dto.getOwnerId());
		entity.setOwnerPhone(dto.getOwnerPhone());
		entity.setParkingArea(dto.getParkingArea());
		entity.setSocietyId(dto.getSocietyId());
		entity.setTennantId(dto.getTennantId());
		entity.setTennantName(dto.getTennantName());
		entity.setUserPass(dto.getUserPass());
		entity.setVaccantDate(dto.getVaccantDate());

		return entity;
	}

	public static List<VisitorDTO> visitorEntityToDataObject(List<Visitor> entities) {

		List<VisitorDTO> dtos = new ArrayList<>();
		for (Visitor entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;

	}

	public static VisitorDTO entityToDataObject(Visitor entity) {
		if (null == entity) {
			return null;
		}
		VisitorDTO dto = new VisitorDTO();
		dto.setComments(entity.getComments());
		dto.setFlatid(entity.getFlatid());
		dto.setIdType(entity.getIdType());
		dto.setIdValue(entity.getIdValue());
		dto.setInTime(entity.getInTime());
		dto.setArrived(entity.isArrived());
		dto.setPassIssued(entity.isPassIssued());
		dto.setPassIssued(entity.isPassIssued());
		dto.setVerified(entity.isVerified());
		dto.setVisitorActive(entity.isVisitorActive());
		dto.setFirstName(entity.getFirstName());
		dto.setMiddleName(entity.getMiddleName());
		dto.setLastName(entity.getLastName());
		dto.setOutTime(entity.getOutTime());
		dto.setPhone(entity.getPhone());
		dto.setAlternativePhone(entity.getAlternativePhone());
		dto.setPhotoPath(entity.getPhotoPath());
		dto.setSignaturePath(entity.getSignaturePath());
		dto.setType(entity.getVisitorType().getVtId());
		dto.setVehicleNo(entity.getVehicleNo());
		dto.setVehicleType(entity.getVehicleType());
		dto.setVid(entity.getVid());// pk
		dto.setVisitorAddress(entity.getVisitorAddress());

		return dto;
	}

	public static StaffDTO entityToDataObject(Staff staff) {

		StaffDTO dto = new StaffDTO();
		dto.setStaffName(staff.getStaffName());
		dto.setStaffPhone(staff.getStaffPhone());

		return dto;
	}

	public static List<StaffDTO> staffEntityListToDataObject(List<Staff> staffEntity) {

		List<StaffDTO> dtos = new ArrayList<>();
		for (Staff entity : staffEntity) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static StateDTO entityToDataObject(State state) {
		return new StateDTO(state.getStateId(), state.getCountryId(), state.getStateName());
	}

	public static List<StateDTO> stateEntityListToDataObject(List<State> entities) {

		List<StateDTO> dtos = new ArrayList<>();
		for (State entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static DistrictDTO entityToDataObject(District entity) {
		if (null == entity) {
			return null;
		}
		return new DistrictDTO(entity.getDid(), entity.getDistrictName(), entity.getStateId());
	}

	public static List<DistrictDTO> districtEntityListToDataObject(List<District> entities) {

		List<DistrictDTO> dtos = new ArrayList<>();
		for (District entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static CountryDTO entityToDataObject(Country country) {

		return new CountryDTO(country.getCountryId(), country.getContinent(), country.getCountryName());
	}

	public static List<CountryDTO> countryEntityListToDataObject(List<Country> entities) {
		List<CountryDTO> dtos = new ArrayList<>();
		for (Country entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static List<CityDTO> cityEntityListToDataObject(List<City> entities) {
		List<CityDTO> dtos = new ArrayList<>();
		for (City entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static List<City> cityDataListToEntityObject(List<CityDTO> dtos) {
		List<City> entities = new ArrayList<>();
		for (CityDTO dto : dtos) {
			entities.add(dataToEntityObject(dto));
		}
		return entities;
	}

	public static CityDTO entityToDataObject(City city) {
		return new CityDTO(city.getCid(), city.getCityName(), city.getDistrictId());
	}

	private static City dataToEntityObject(CityDTO cityDTO) {
		return new City(cityDTO.getCid(), cityDTO.getCityName(), cityDTO.getDistrictId());
	}

	public static SocietyDTO entityToDataObject(Society entity) {

		if (null == entity) {
			return null;
		}
		SocietyDTO dto = new SocietyDTO();
		dto.setSocietyId(entity.getSocietyId());
		dto.setSocietyIdDisplay(entity.getSocietyIdDisplay());
		dto.setSocietyName(entity.getSocietyName());
		//TODO: add other setters
		// ...
		// ...

		return dto;
	}

	public static List<SocietyDTO> societyEntityListToDataObject(List<Society> entities) {

		List<SocietyDTO> dtos = new ArrayList<>();
		for (Society entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static List<Society> societyDataListToEntityObject(List<SocietyDTO> dtos) {
		List<Society> entities = new ArrayList<>();
		for (SocietyDTO dto : dtos) {
			entities.add(dataObjectToEntity(dto));
		}
		return entities;
	}



	public static SocietyEnrolment dataToEntityObject(EnrolmentData data) {
		if (null == data) {
			return null;
		}
		SocietyEnrolment entity = new SocietyEnrolment();
		entity.setId(data.getId());
		entity.setUserId(data.getUserId());
		entity.setSocietyId(data.getUserId());
		entity.setDistrict(data.getDistrict());
		entity.setState(data.getState());
		entity.setCity(data.getCity());
		entity.setEmail(data.getEmail());
		entity.setFirstName(data.getFirstName());
		entity.setLastName(data.getLastName());
		entity.setComments(data.getComments());
		entity.setDocAttached(data.isDocAttached());
		entity.setManagementSocietyManagementTeam(data.isManagementSocietyManagementTeam());
		entity.setPhone(data.getPhone());
		entity.setSocietyAddress(data.getSocietyAddress());
		entity.setSocietyId(data.getSocietyId());
		entity.setSocietyName(data.getSocietyName());
		// entity.setState(data.getPhone());

		return entity;
	}

	public static EnrolmentData entityToDataObject(SocietyEnrolment entity) {

		if (null == entity) {
			return null;
		}

		EnrolmentData dto = new EnrolmentData();
		dto.setId(entity.getId());
		dto.setUserId(entity.getUserId());
		dto.setSocietyId(entity.getUserId());
		dto.setDistrict(entity.getDistrict());
		dto.setState(entity.getState());
		dto.setCity(entity.getCity());
		dto.setEmail(entity.getEmail());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setComments(entity.getComments());
		dto.setDocAttached(entity.isDocAttached());
		dto.setManagementSocietyManagementTeam(entity.isManagementSocietyManagementTeam());
		dto.setPhone(entity.getPhone());
		dto.setSocietyAddress(entity.getSocietyAddress());
		dto.setSocietyId(entity.getSocietyId());
		dto.setSocietyName(entity.getSocietyName());
		// dto.setState(entity.getState());

		return dto;
	}

	public static List<EnrolmentData> societyEnrollEntityListToDataObject(List<SocietyEnrolment> entities) {

		List<EnrolmentData> dtos = new ArrayList<>();
		for (SocietyEnrolment entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static AdvanceVisitorRequestDTO entityToDataObject(AdvanceVisitorRequest entity) {

		if (null == entity) {
			return null;
		}

		AdvanceVisitorRequestDTO dto = new AdvanceVisitorRequestDTO();
		// dto.setAvId(avId);

		dto.setAvId(entity.getAvId());
		dto.setBlockId(entity.getBlockId());
		dto.setComments(entity.getComments());
		dto.setCompany(entity.getCompany());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedTime(entity.getCreatedTime());
		dto.setEstimateInTime(entity.getEstimateInTime());
		dto.setEstimateOutTime(entity.getEstimateOutTime());
		dto.setFlatId(entity.getFlatId());
		dto.setCheckedIn(entity.isCheckedIn());
		dto.setPersonCount(entity.getPersonCount());
		dto.setPurpose(entity.getPurpose());
		dto.setSocietyId(entity.getSocietyId());
		dto.setVisitorAddress(entity.getVisitorAddress());
		dto.setVisitorDescription(entity.getVisitorDescription());
		
		dto.setVisitorFirstName(entity.getVisitorFirstName());
		dto.setVisitorMiddleName(entity.getVisitorMiddleName());
		dto.setVisitorLastName(entity.getVisitorLastName());
		
		dto.setVisitorOtp(entity.getVisitorOtp());
		dto.setVisitorPhone(entity.getVisitorPhone());
		dto.setVisitorType(entity.getVisitorType());

		return dto;
	}

	public static AdvanceVisitorRequest dataToEntityObject(AdvanceVisitorRequestDTO data) {

		if (null == data) {
			return null;
		}

		AdvanceVisitorRequest entity = new AdvanceVisitorRequest();
		entity.setBlockId(data.getBlockId());
		entity.setComments(data.getComments());
		entity.setCompany(data.getCompany());
		entity.setCreatedBy(data.getCreatedBy());
		entity.setCreatedTime(data.getCreatedTime());
		entity.setEstimateInTime(data.getEstimateInTime());
		entity.setEstimateOutTime(data.getEstimateOutTime());
		entity.setFlatId(data.getFlatId());
		entity.setCheckedIn(data.isCheckedIn());
		entity.setPersonCount(data.getPersonCount());
		entity.setPurpose(data.getPurpose());
		entity.setSocietyId(data.getSocietyId());
		entity.setVisitorAddress(data.getVisitorAddress());
		entity.setVisitorDescription(data.getVisitorDescription());
		
		entity.setVisitorFirstName(data.getVisitorFirstName());
		entity.setVisitorMiddleName(data.getVisitorMiddleName());
		entity.setVisitorLastName(data.getVisitorLastName());
		
		entity.setVisitorOtp(data.getVisitorOtp());
		entity.setVisitorPhone(data.getVisitorPhone());
		entity.setVisitorType(data.getVisitorType());

		return entity;
	}

	public static NeibourhoodEmployee dataObjectToEntity(NeibourhoodEmployeeDTO dto) {

		if (null == dto) {
			return null;
		}
		NeibourhoodEmployee entity = new NeibourhoodEmployee();

		entity.setNeId(dto.getNeId());
		entity.setAddress(dto.getAddress());
		entity.setCreatedDate(dto.getCreatedDate());
		entity.setIsActive(dto.getIsActive());
		entity.setJobDesc(dto.getJobDesc());
		entity.setName(dto.getName());
		entity.setNeDob(dto.getNeDob());
		entity.setPhone(dto.getPhone());

		entity.setNeibourhoodType(new NeibourhoodType(dto.getNeibourhoodType().getNtId(),
				dto.getNeibourhoodType().getDescription(), dto.getNeibourhoodType().getType(), null));

		Neighbourhood n = new Neighbourhood();
		n.setNid(dto.getNeighbourhood().getNid());
		entity.setNeighbourhood(n);
		;
		return entity;
	}

	public static NeibourhoodEmployeeDTO entityToDataObject(NeibourhoodEmployee entity) {
		if (null == entity) {
			return null;
		}

		NeibourhoodEmployeeDTO dto = new NeibourhoodEmployeeDTO();

		dto.setNeId(entity.getNeId());
		dto.setAddress(entity.getAddress());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setIsActive(entity.getIsActive());
		dto.setJobDesc(entity.getJobDesc());
		dto.setName(entity.getName());
		dto.setNeDob(entity.getNeDob());
		dto.setPhone(entity.getPhone());

		dto.setNeibourhoodType(entityToDataObject(entity.getNeibourhoodType()));

		dto.setNeighbourhood(entityToDataObject(entity.getNeighbourhood()));

		return dto;
	}

	public static NeibourhoodTypeDTO entityToDataObject(NeibourhoodType entity) {
		if (null == entity) {
			return null;
		}

		NeibourhoodTypeDTO dto = new NeibourhoodTypeDTO();

		dto.setNtId(entity.getNtId());
		dto.setDescription(entity.getDescription());
		dto.setType(entity.getType());
		dto.setNeibourhoodEmployees(null);

		return dto;
	}

	public static NeighbourhoodDTO entityToDataObject(Neighbourhood entity) {

		if (null == entity) {
			return null;
		}

		NeighbourhoodDTO dto = new NeighbourhoodDTO();
		dto.setNid(entity.getNid());
		dto.setActivationDate(entity.getActivationDate());
		dto.setAddress(entity.getAddress());
		dto.setContactNumber(entity.getContactNumber());
		dto.setGpsTagValue(entity.getGpsTagValue());
		dto.setGstin(entity.getGstin());
		dto.setActive(entity.isActive());
		dto.setPasscodeEntryAuthorised(entity.isPasscodeEntryAuthorised());
		dto.setNeighbourName(entity.getNeighbourName());
		dto.setPan(entity.getPan());
		dto.setRegdDate(entity.getRegdDate());
		dto.setNeibourhoodType(entity.getNeibourhoodType().getNtId());
		// dto.setShopNumber(entity.getShopNumber());
		dto.setUserId(entity.getUserId());
		dto.setAddress(entity.getAddress());
		dto.setManagerName(entity.getManagerName());
		dto.setNeighbourName(entity.getNeighbourName());
		dto.setRegdNo(entity.getRegdNo());
		dto.setOwnerName(entity.getOwnerName());
		dto.setStatusId(entity.getStatusId());
		dto.setRegdAddress(entity.getRegdAddress());
		dto.setComment(dto.getComment());

		return dto;
	}

	public static List<NeibourhoodEmployeeDTO> neibourhoodEmployeeEntityListToDataObject(
			List<NeibourhoodEmployee> entities) {

		List<NeibourhoodEmployeeDTO> dtos = new ArrayList<NeibourhoodEmployeeDTO>();
		for (NeibourhoodEmployee entity : entities) {
			dtos.add(entityToDataObject(entity));
		}

		return dtos;
	}

	public static NeighbourhoodPassDetailDTO entityToDataObject(NeighbourhoodPassDetail entity) {

		if (null == entity) {
			return null;
		}

		NeighbourhoodPassDetailDTO dto = new NeighbourhoodPassDetailDTO();

		dto.setNpId(entity.getNpId());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setIsActive(entity.getIsActive());
		dto.setPassCode(entity.getPassCode());
		dto.setPassEntryEndTime(entity.getPassEntryEndTime());
		dto.setPassEntryStartTime(entity.getPassEntryStartTime());
		dto.setValidTill(entity.getValidTill());

		dto.setNeighbourhood(entityToDataObject(entity.getNeighbourhood()));

		// bi-directional many-to-one association to Neighbourhood_PassType
		dto.setNeighbourhoodPassType(entityToDataObject(entity.getNeighbourhoodPassType()));

		// bi-directional many-to-one association to Society
		dto.setSociety(entityToDataObject(entity.getSociety()));

		return dto;
	}

	private static Neighbourhood_PassTypeDTO entityToDataObject(Neighbourhood_PassType entity) {
		if (null == entity) {
			return null;
		}

		Neighbourhood_PassTypeDTO dto = new Neighbourhood_PassTypeDTO();

		dto.setNptId(entity.getNptId());
		dto.setComments(entity.getComments());
		dto.setPassName(entity.getPassName());
		dto.setValidity(entity.getValidity());

		// bi-directional many-to-one association to NeighbourhoodPassEntry
		dto.setNeighbourhoodPassEntries(null);

		return dto;
	}

	public static NeighbourhoodPassDetail dataObjectToEntity(NeighbourhoodPassDetailDTO dto) {

		if (null == dto) {
			return null;
		}
		NeighbourhoodPassDetail entity = new NeighbourhoodPassDetail();

		entity.setNpId(dto.getNpId());
		entity.setCreatedDate(dto.getCreatedDate());
		entity.setIsActive(dto.getIsActive());
		entity.setPassCode(dto.getPassCode());
		entity.setPassEntryEndTime(dto.getPassEntryEndTime());
		entity.setPassEntryStartTime(dto.getPassEntryStartTime());
		entity.setValidTill(dto.getValidTill());

		entity.setNeighbourhood(dataObjectToEntity(dto.getNeighbourhood()));

		// bi-directional many-to-one association to Neighbourhood_PassType
		entity.setNeighbourhoodPassType(dataObjectToEntity(dto.getNeighbourhoodPassType()));

		// bi-directional many-to-one association to Society
		entity.setSociety(dataObjectToEntity(dto.getSociety()));

		return entity;
	}

	private static Society dataObjectToEntity(SocietyDTO dto) {
		
		Society entity = new Society();
		entity.setSocietyId(dto.getSocietyId());
		entity.setSocietyIdDisplay(dto.getSocietyIdDisplay());
		entity.setSocietyName(dto.getSocietyName());
		// TODO Auto-generated method stub
		//...
		//...
		
		return entity;
	}
	


	private static Neighbourhood_PassType dataObjectToEntity(Neighbourhood_PassTypeDTO dto) {
		if (null == dto) {
			return null;
		}
		Neighbourhood_PassType entity = new Neighbourhood_PassType();

		entity.setNptId(dto.getNptId());
		entity.setComments(dto.getComments());
		entity.setPassName(dto.getPassName());
		entity.setValidity(dto.getValidity());

		// bi-directional many-to-one association to NeighbourhoodPassEntry
		entity.setNeighbourhoodPassEntries(null);

		return entity;
	}

	public static Neighbourhood dataObjectToEntity(NeighbourhoodDTO dto) {

		if (null == dto) {
			return null;
		}
		Neighbourhood entity = new Neighbourhood();
		entity.setNid(dto.getNid());
		entity.setActivationDate(dto.getActivationDate());
		entity.setAddress(dto.getAddress());
		entity.setContactNumber(dto.getContactNumber());
		entity.setGpsTagValue(dto.getGpsTagValue());
		entity.setGstin(dto.getGstin());
		entity.setActive(dto.isActive());
		entity.setPasscodeEntryAuthorised(dto.isPasscodeEntryAuthorised());
		entity.setNeighbourName(dto.getNeighbourName());
		entity.setPan(dto.getPan());
		entity.setRegdDate(dto.getRegdDate());
		entity.setNeibourhoodType(new NeibourhoodType(dto.getNeibourhoodType(), null, null, null));
		// entity.setShopNumber(dto.getShopNumber());
		entity.setUserId(dto.getUserId());
		entity.setAddress(dto.getAddress());
		entity.setManagerName(dto.getManagerName());
		entity.setNeighbourName(dto.getNeighbourName());
		entity.setRegdNo(dto.getRegdNo());
		entity.setOwnerName(dto.getOwnerName());
		entity.setStatusId(dto.getStatusId());
		entity.setComment(dto.getComment());
		entity.setRegdAddress(dto.getRegdAddress());

		return entity;
	}

	public static List<NeighbourhoodPassDetailDTO> neibourhoodEPassDetailsListToDataObject(
			List<NeighbourhoodPassDetail> entities) {

		List<NeighbourhoodPassDetailDTO> dtos = new ArrayList<NeighbourhoodPassDetailDTO>();

		for (NeighbourhoodPassDetail entity : entities) {
			dtos.add(entityToDataObject(entity));
		}

		return dtos;
	}

	public static List<NeighbourhoodDTO> neighbourhoodEntityListToDataObject(List<Neighbourhood> entities) {
		List<NeighbourhoodDTO> dtos = new ArrayList<NeighbourhoodDTO>();

		for (Neighbourhood entity : entities) {
			dtos.add(entityToDataObject(entity));
		}

		return dtos;
	}

	public static MenuLinkDTO entityToDataObject(MenuLink entity) {
		if (null == entity) {
			return null;
		}

		MenuLinkDTO dto = new MenuLinkDTO();
		dto.setMenuId(entity.getMenuId());
		dto.setDisplayName(entity.getDisplayName());
		dto.setIsAdminMenu(entity.getIsAdminMenu());
		dto.setIsCommonMenu(entity.getIsCommonMenu());
		dto.setIsFactoryDefault(entity.getIsFactoryDefault());
		dto.setIsOnclickAction(entity.getIsOnclickAction());
		dto.setMenuLocation(entity.getMenuLocation());
		dto.setParentMenu(entity.getParentMenu());
		dto.setUrl(entity.getUrl());
		// dto.setRoles(roleEntityListToDataObject(entity.getRoles()));

		return dto;
	}

	public static List<MenuLinkDTO> menuLinkEntityListToDataObject(List<MenuLink> entities) {
		List<MenuLinkDTO> dtos = new ArrayList<>();
		for (MenuLink entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static List<MenuLink> menuLinkDataObjectToEntityList(List<MenuLinkDTO> dtos) {
		List<MenuLink> entities = new ArrayList<>();
		for (MenuLinkDTO dto : dtos) {
			entities.add(dataObjectToEntity(dto));
		}
		return entities;
	}

	public static List<RoleDTO> roleEntityListToDataObject(List<Role> entities) {
		List<RoleDTO> dtos = new ArrayList<RoleDTO>();
		for (Role entity : entities) {
			dtos.add(entityToDataObject(entity));
		}
		return dtos;
	}

	public static List<Role> roleDataObjectToEntityList(List<RoleDTO> dtos) {
		List<Role> entities = new ArrayList<>();
		for (RoleDTO dto : dtos) {
			entities.add(dataObjectToEntity(dto));
		}
		return entities;
	}

	public static RoleDTO entityToDataObject(Role entity) {

		if (null == entity) {
			return null;
		}
		RoleDTO dto = new RoleDTO();
		dto.setRoleId(entity.getRoleId());
		dto.setGroupDescription(entity.getGroupDescription());
		dto.setGroupName(entity.getGroupName());
		dto.setIsEnabled(entity.getIsEnabled());
		dto.setMenuLinks(menuLinkEntityListToDataObject(entity.getMenuLinks()));

		return dto;
	}

	public static Role dataObjectToEntity(RoleDTO dto) {

		if (null == dto) {
			return null;
		}

		Role entity = new Role();
		entity.setRoleId(dto.getRoleId());
		entity.setGroupDescription(dto.getGroupDescription());
		entity.setGroupName(dto.getGroupName());
		entity.setIsEnabled(dto.getIsEnabled());
		entity.setMenuLinks(menuLinkDataObjectToEntityList(dto.getMenuLinks()));

		return entity;
	}

	public static MenuLink dataObjectToEntity(MenuLinkDTO dto) {

		if (null == dto) {
			return null;
		}

		MenuLink entity = new MenuLink();
		entity.setMenuId(dto.getMenuId());
		entity.setDisplayName(dto.getDisplayName());
		entity.setIsAdminMenu(dto.getIsAdminMenu());
		entity.setIsCommonMenu(dto.getIsCommonMenu());
		entity.setIsFactoryDefault(dto.getIsFactoryDefault());
		entity.setIsOnclickAction(dto.getIsOnclickAction());
		entity.setMenuLocation(dto.getMenuLocation());
		entity.setParentMenu(dto.getParentMenu());
		entity.setUrl(dto.getUrl());
		entity.setRoles(roleDataObjectToEntityList(dto.getRoles()));
		return entity;
	}

	public static Visitor dataObjectToEntity(VisitorDTO dto) {
		

		Visitor entity = new Visitor();

		entity.setComments(dto.getComments());
		entity.setFlatid(dto.getFlatid());
		entity.setIdType(dto.getIdType());
		entity.setIdValue(dto.getIdValue());
		entity.setInTime(dto.getInTime());
		entity.setArrived(dto.isArrived());
		entity.setPassIssued(dto.isPassIssued());
		entity.setPassIssued(dto.isPassIssued());
		entity.setVerified(dto.isVerified());
		entity.setVisitorActive(dto.isVisitorActive());
		
		entity.setFirstName(dto.getFirstName());
		entity.setMiddleName(dto.getMiddleName());
		entity.setLastName(dto.getLastName());
		
		entity.setOutTime(dto.getOutTime());
		entity.setPhone(dto.getPhone());
		entity.setAlternativePhone(dto.getAlternativePhone());
		entity.setPhotoPath(dto.getPhotoPath());
		entity.setSignaturePath(dto.getSignaturePath());
		entity.setVisitorType(new VisitorType(dto.getType(), null, null));
		entity.setVehicleNo(dto.getVehicleNo());
		entity.setVehicleType(dto.getVehicleType());
		entity.setVid(dto.getVid());// pk
		entity.setVisitorAddress(dto.getVisitorAddress());

		return entity;
	}

	public static NotificationDTO entityToDataObject(Notification entity) {

		NotificationDTO dto = new NotificationDTO();
		dto.setNid(entity.getNid());
		dto.setCreatedAt(entity.getCreatedAt());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setDescription(entity.getDescription());
		dto.setForUser(entity.getForUser());
		dto.setIsExpired(entity.getIsExpired());
		dto.setIsRead(entity.getIsRead());
		dto.setNotificationText(entity.getNotificationText());
		dto.setUserOptedAt(entity.getUserOptedAt());
		if (entity.getUserSelectedButton() != null) {

			dto.setUserSelectedButton(entityToDataObject(entity.getUserSelectedButton()));
		}
		if (entity.getNotificationType() != null) {

			dto.setNotificationType(entityToDataObject(entity.getNotificationType()));
		}

		return dto;
	}

	public static Notification dataObjectToEntity(NotificationDTO request) {

		Notification entity = new Notification();

		entity.setNid(request.getNid());
		entity.setCreatedAt(request.getCreatedAt());
		entity.setCreatedBy(request.getCreatedBy());
		entity.setDescription(request.getDescription());
		entity.setForUser(request.getForUser());
		entity.setIsExpired(request.getIsExpired());
		entity.setIsRead(request.getIsRead());
		entity.setNotificationText(request.getNotificationText());
		entity.setUserOptedAt(request.getUserOptedAt());

		if (request.getUserSelectedButton() == null) {
			entity.setUserSelectedButton(dataObjectToEntity(request.getUserSelectedButton()));
		}
		if (request.getNotificationType() == null) {
			entity.setNotificationType(dataObjectToEntity(request.getNotificationType()));
		}

		return entity;
	}

	public static List<NotificationDTO> notificationEntityListToDataObject(List<Notification> entities) {
		List<NotificationDTO> dtos = new ArrayList<>();

		for (Notification notification : entities) {
			dtos.add(entityToDataObject(notification));
		}
		return dtos;
	}

	public static List<Notification> notificationDataObjectListToEntity(List<NotificationDTO> dtos) {
		List<Notification> entities = new ArrayList<>();

		for (NotificationDTO notification : dtos) {
			entities.add(dataObjectToEntity(notification));
		}
		return entities;
	}

	public static NotificationTypeDTO entityToDataObject(NotificationType entity) {

		NotificationTypeDTO dto = new NotificationTypeDTO();
		dto.setNtid(entity.getNtid());
		dto.setDescription(entity.getDescription());
		dto.setType(entity.getType());
		dto.setActionButtons(notificationActionEntityListToDataObject(entity.getActionButtons()));

		return dto;
	}

	public static NotificationType dataObjectToEntity(NotificationTypeDTO dto) {
		NotificationType entity = new NotificationType();

		entity.setNtid(dto.getNtid());
		entity.setDescription(dto.getDescription());
		entity.setType(dto.getType());
		entity.setActionButtons(notificationActionDataObjectListToEntity(dto.getActionButtons()));

		return entity;
	}

	public static NotificationActionButtonDTO entityToDataObject(NotificationActionButton entity) {

		NotificationActionButtonDTO dto = new NotificationActionButtonDTO(entity.getAbId(), entity.getButtonDesc(),
				entity.getButtonName());

		return dto;
	}

	public static List<NotificationActionButton> notificationActionDataObjectListToEntity(
			List<NotificationActionButtonDTO> dtos) {

		List<NotificationActionButton> entities = new ArrayList<NotificationActionButton>();

		// NotificationActionButton entity = new NotificationActionButton(dto.getAbId(),
		// dto.getButtonDesc(), dto.getButtonName());
		for (NotificationActionButtonDTO entity : dtos) {
			entities.add(dataObjectToEntity(entity));
		}

		return entities;
	}

	public static List<NotificationActionButtonDTO> notificationActionEntityListToDataObject(
			List<NotificationActionButton> entities) {

		List<NotificationActionButtonDTO> dtos = new ArrayList<>();

		for (NotificationActionButton entity : entities) {
			dtos.add(entityToDataObject(entity));
		}

		// NotificationActionButton entity = new NotificationActionButton(dto.getAbId(),
		// dto.getButtonDesc(), dto.getButtonName());

		return dtos;
	}

	public static NotificationActionButton dataObjectToEntity(NotificationActionButtonDTO dto) {

		NotificationActionButton entity = new NotificationActionButton(dto.getAbId(), dto.getButtonDesc(),
				dto.getButtonName());

		return entity;
	}

	public static VoteDTO entityToDataObject(Vote entity) {

		VoteDTO dto = new VoteDTO();
		dto.setVid(entity.getVid());
		dto.setCreatedAt(entity.getCreatedAt());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setDescription(entity.getDescription());
		dto.setForUser(entity.getForUser());
		dto.setExpired(entity.isExpired());
		dto.setRead(entity.isRead());
		dto.setVoteText(entity.getVoteText());
		dto.setUserOptedAt(entity.getUserOptedAt());
		dto.setVoteName(entity.getVoteName());
		dto.setVoteSubject(entityToDataObject(entity.getVoteSubject()));

		if (entity.getUserSelectedButton() != null) {

			dto.setUserSelectedButton(entityToDataObject(entity.getUserSelectedButton()));
		}
		if (entity.getVoteType() != null) {

			dto.setVoteType(entityToDataObject(entity.getVoteType()));
		}

		return dto;
	}

	public static Vote dataObjectToEntity(VoteDTO request) {
		Vote entity = new Vote();

		entity.setVid(request.getVid());
		entity.setCreatedAt(request.getCreatedAt());
		entity.setCreatedBy(request.getCreatedBy());
		entity.setDescription(request.getDescription());
		entity.setForUser(request.getForUser());
		entity.setExpired(request.isExpired());
		entity.setRead(request.isRead());
		entity.setVoteText(request.getVoteText());
		entity.setUserOptedAt(request.getUserOptedAt());
		entity.setVoteName(request.getVoteName());
		entity.setVoteSubject(dataObjectToEntity(request.getVoteSubject()));

		if (request.getUserSelectedButton() == null) {
			entity.setUserSelectedButton(dataObjectToEntity(request.getUserSelectedButton()));
		}
		if (request.getVoteType() == null) {
			entity.setVoteType(dataObjectToEntity(request.getVoteType()));
		}

		return entity;
	}

	public static List<VoteDTO> voteEntityListToDataObject(List<Vote> entities) {
		List<VoteDTO> dtos = new ArrayList<>();

		for (Vote vote : entities) {
			dtos.add(entityToDataObject(vote));
		}
		return dtos;
	}

	public static List<Vote> VoteDataObjectListToEntity(List<VoteDTO> dtos) {
		List<Vote> entities = new ArrayList<>();

		for (VoteDTO vote : dtos) {
			entities.add(dataObjectToEntity(vote));
		}
		return entities;
	}

	public static VoteTypeDTO entityToDataObject(VoteType entity) {

		VoteTypeDTO dto = new VoteTypeDTO();
		dto.setVtid(entity.getVtid());
		dto.setDescription(entity.getDescription());
		dto.setType(entity.getType());
		dto.setVoteActionButtons(voteActionEntityListToDataObject(entity.getVoteActionButtons()));

		return dto;
	}

	public static VoteType dataObjectToEntity(VoteTypeDTO dto) {
		VoteType entity = new VoteType();

		entity.setVtid(dto.getVtid());
		entity.setDescription(dto.getDescription());
		entity.setType(dto.getType());
		entity.setVoteActionButtons(voteActionDataObjectListToEntity(dto.getVoteActionButtons()));

		return entity;
	}

	public static VoteSubjectDTO entityToDataObject(VoteSubject entity) {

		VoteSubjectDTO dto = new VoteSubjectDTO();
		dto.setVsId(entity.getVsId());
		dto.setSubject(entity.getSubject());
		return dto;
	}

	public static VoteSubject dataObjectToEntity(VoteSubjectDTO dto) {
		VoteSubject entity = new VoteSubject();

		dto.setVsId(entity.getVsId());
		dto.setSubject(entity.getSubject());
		return entity;
	}

	public static VoteActionButtonDTO entityToDataObject(VoteActionButton entity) {

		VoteActionButtonDTO dto = new VoteActionButtonDTO(entity.getVabId(), entity.getButtonDesc(),
				entity.getButtonName());

		return dto;
	}

	public static List<VoteActionButton> voteActionDataObjectListToEntity(List<VoteActionButtonDTO> dtos) {

		List<VoteActionButton> entities = new ArrayList<VoteActionButton>();

		// NotificationActionButton entity = new NotificationActionButton(dto.getAbId(),
		// dto.getButtonDesc(), dto.getButtonName());
		for (VoteActionButtonDTO entity : dtos) {
			entities.add(dataObjectToEntity(entity));
		}

		return entities;
	}

	public static List<VoteActionButtonDTO> voteActionEntityListToDataObject(List<VoteActionButton> entities) {

		List<VoteActionButtonDTO> dtos = new ArrayList<>();

		for (VoteActionButton entity : entities) {
			dtos.add(entityToDataObject(entity));
		}

		// VoteActionButton entity = new VoteActionButton(dto.getAbId(),
		// dto.getButtonDesc(), dto.getButtonName());

		return dtos;
	}

	public static VoteActionButton dataObjectToEntity(VoteActionButtonDTO dto) {

		VoteActionButton entity = new VoteActionButton(dto.getVabId(), dto.getButtonDesc(), dto.getButtonName());

		return entity;
	}
	
	public static DailyVisitor entityToDataObject(DailyVisitorDTO dto){
		DailyVisitor entity = new DailyVisitor();
		
		entity.setDvId(dto.getDvId ());
		entity.setAadharNo(dto.getAadharNo ());
		entity.setAddCountry(dto.getAddCountry ());
		entity.setAddDistrict(dto.getAddDistrict ());
		entity.setAddPin(dto.getAddPin ());
		entity.setAddState(dto.getAddState ());
		entity.setAge(dto.getAge ());
		entity.setAlternativePhone(dto.getAlternativePhone ());
		entity.setBloodGroup(dto.getBloodGroup ());
		entity.setComment(dto.getComment ());
		entity.setCreatedBy(dto.getCreatedBy ());
		entity.setDefaultRole(dto.getDefaultRole ());
		entity.setDob(dto.getDob ());
		entity.setFirstName(dto.getFirstName ());
		entity.setIdType(dto.getIdType ());
		entity.setDeleted(entity.isDeleted ());
		entity.setEnabled(entity.isEnabled ());
		entity.setUserRegdComplete(entity.isUserRegdComplete ());
		entity.setLastName(dto.getLastName ());
		entity.setMemberSince(dto.getMemberSince ());
		entity.setMiddleName(dto.getMiddleName ());
		entity.setPanNo(dto.getPanNo ());
		entity.setPhoneImei(dto.getPhoneImei ());
		entity.setPhotoPath(dto.getPhotoPath ());
		entity.setSignaturePath(dto.getSignaturePath ());
		entity.setPurpose(dto.getPurpose ());
		entity.setReferedBy(dto.getReferedBy ());
		entity.setSex(dto.getSex ());
		entity.setTimezone(dto.getTimezone ());
		entity.setUserDl(dto.getUserDl ());
		entity.setUserGroup(dto.getUserGroup ());
		entity.setVisitorAddress(dto.getVisitorAddress ());
		entity.setVisitorEmail(dto.getVisitorEmail ());
		entity.setVisitorPhone(dto.getVisitorPhone ());
		entity.setLastVisitedFlat(dto.getLastVisitedFlat ());
		return entity;
	}

	public static DailyVisitorDTO entityToDataObject(DailyVisitor entity) {
		
		DailyVisitorDTO dto = new DailyVisitorDTO();
		
		dto.setDvId(entity.getDvId ());
		dto.setAadharNo(entity.getAadharNo ());
		dto.setAddCountry(entity.getAddCountry ());
		dto.setAddDistrict(entity.getAddDistrict ());
		dto.setAddPin(entity.getAddPin ());
		dto.setAddState(entity.getAddState ());
		dto.setAge(entity.getAge ());
		dto.setAlternativePhone(entity.getAlternativePhone ());
		dto.setBloodGroup(entity.getBloodGroup ());
		dto.setComment(entity.getComment ());
		dto.setCreatedBy(entity.getCreatedBy ());
		dto.setDefaultRole(entity.getDefaultRole ());
		dto.setDob(entity.getDob ());
		dto.setFirstName(entity.getFirstName ());
		dto.setIdType(entity.getIdType ());
		dto.setDeleted(entity.isDeleted ());
		dto.setEnabled(entity.isEnabled ());
		dto.setUserRegdComplete(entity.isUserRegdComplete ());
		dto.setLastName(entity.getLastName ());
		dto.setMemberSince(entity.getMemberSince ());
		dto.setMiddleName(entity.getMiddleName ());
		dto.setPanNo(entity.getPanNo ());
		dto.setPhoneImei(entity.getPhoneImei ());
		dto.setPhotoPath(entity.getPhotoPath ());
		dto.setSignaturePath(entity.getSignaturePath ());
		dto.setPurpose(entity.getPurpose ());
		dto.setReferedBy(entity.getReferedBy ());
		dto.setSex(entity.getSex ());
		dto.setTimezone(entity.getTimezone ());
		dto.setUserDl(entity.getUserDl ());
		dto.setUserGroup(entity.getUserGroup ());
		dto.setVisitorAddress(entity.getVisitorAddress ());
		dto.setVisitorEmail(entity.getVisitorEmail ());
		dto.setVisitorPhone(entity.getVisitorPhone ());
		dto.setLastVisitedFlat(entity.getLastVisitedFlat ());
		
		
		return dto;
	}

}
