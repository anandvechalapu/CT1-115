·       Validate the given Input data based on the validation rules.·       If the validations are failed display respectives validation errors .·       If no validation errors then update Global Settings/Setup Values. 

import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalSettingsRepository extends JpaRepository<GlobalSettings, Long>{

    GlobalSettings findByDatabaseId(String databaseId);
    
    GlobalSettings findByWeightingFactorZeroMins(Integer weightingFactorZeroMins);
    GlobalSettings findByWeightingFactorOneToTenMins(Integer weightingFactorOneToTenMins);
    GlobalSettings findByWeightingFactorElevenToTwentyMins(Integer weightingFactorElevenToTwentyMins);
    GlobalSettings findByWeightingFactorTwentyOneToThirtyMins(Integer weightingFactorTwentyOneToThirtyMins);
    GlobalSettings findByWeightingFactorThirtyOneToSixtyMins(Integer weightingFactorThirtyOneToSixtyMins);
    GlobalSettings findByWeightingFactorSixtyPlusMins(Integer weightingFactorSixtyPlusMins);
    GlobalSettings findByDeliveryCutOffEfficiency(Integer deliveryCutOffEfficiency);
    GlobalSettings findByMaximumCapCompensation(Integer maximumCapCompensation);
    GlobalSettings findByEarliestSatCapCompensation(Integer earliestSatCapCompensation);

}