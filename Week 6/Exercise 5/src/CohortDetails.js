import styles from './CohortDetails.module.css';
function CohortDetails(props) {
  const statusClass = props.cohort.currentStatus === 'Ongoing' ? styles.ongoing : styles.other;
  const { cohort } = props;
  return (
    <div className={styles.box}>
      <h3 className={statusClass}>
        {cohort.cohortCode} - <span>{cohort.technology}</span>
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.currentStatus}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coachName}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainerName}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
