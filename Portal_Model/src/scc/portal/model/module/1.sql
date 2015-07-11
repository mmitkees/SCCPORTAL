select * from

(SELECT  COURT_Members.court_member_id, COURT_Members.name , COURT_Members.small_image, COURT_Members.cv_html, 
COURT_Members_Position.period_from_month, COURT_Members_Position.period_from_day, 
COURT_Members_Position.period_from_year,
get_max_position_from_to(7,COURT_Members.court_member_id,0) as prev_pos 
,weight
FROM COURT_Members INNER JOIN
COURT_Members_Position ON COURT_Members.court_member_id = COURT_Members_Position.court_member_id
WHERE (publish=1) AND (COURT_Members_Position.position_id = 6) AND (COURT_Members_Position.is_current = 1)

union

select * from 
(
SELECT  COURT_Members.court_member_id, COURT_Members.name , COURT_Members.small_image, COURT_Members.cv_html, 
 COURT_Members_Position.period_from_month, COURT_Members_Position.period_from_day,  
  COURT_Members_Position.period_from_year,
  get_max_position_from_to(7,COURT_Members.court_member_id,0) as prev_pos ,
  weight
 FROM         COURT_Members INNER JOIN 
 COURT_Members_Position ON COURT_Members.court_member_id = COURT_Members_Position.court_member_id 
 WHERE     (publish=1 ) AND( COURT_Members_Position.position_id = 7) AND (COURT_Members_Position.is_current = 1) 
 ORDER BY weight
 ))
  ORDER BY weight;
  
 